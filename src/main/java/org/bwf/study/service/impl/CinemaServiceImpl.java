package org.bwf.study.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.bwf.obj.bo.CinemaQueryListBO;
import org.bwf.obj.vo.CinemaQueryListVO;
import org.bwf.obj.vo.CinemaQueryModelVO;
import org.bwf.study.dao.*;
import org.bwf.study.model.*;
import org.bwf.study.service.CinemaService;
import org.bwf.study.util.JsonUtil;
import org.bwf.study.util.RedisUntil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CinemaServiceImpl implements CinemaService {

    private final Logger logger = LoggerFactory.getLogger(CinemaServiceImpl.class);

    @Autowired
    private BrandMapper brandMapper;

    @Autowired
    private SpecialHallMapper specialHallMapper;

    @Autowired
    private CinemaMapper cinemaMapper;

    @Autowired
    private CinemaFilmRelMapper cinemaFilmRelMapper;

    @Autowired
    private FilmMapper filmMapper;

    @Autowired
    private WatchTimesMapper watchTimesMapper;

    @Resource
    private RedisUntil redisUntil;

    @Override
    public CinemaQueryListVO CinemaQueryList(CinemaQueryListBO bo) {

        // 先访问缓存，如果没有缓存再访问数据库
        String key = bo.toString();

        Object objCinema = redisUntil.get(key);
        // 说这个bo的查询已经存在于Redis中
        if(objCinema != null){
//            System.out.println("已经从缓存中加载数据：" + key);
            logger.info("已经从缓存中加载数据：" + key);
            return (CinemaQueryListVO) objCinema;
        }


        CinemaQueryListVO cinemaQueryListVO = new CinemaQueryListVO();
        //加载Brand 品牌list
        cinemaQueryListVO.setBrands(brandMapper.selectByExample(null));
        //加载 SpecialHall list
        cinemaQueryListVO.setSpecialHalls(specialHallMapper.selectByExample(null));

        // 获取电影院数据
        // 先判断bo的参数是否存在
        CinemaExample cinemaExample = new CinemaExample();
        CinemaExample.Criteria criteria = cinemaExample.createCriteria();
        if(bo.getBrandId() != null ){
            criteria.andBrandIdEqualTo(bo.getBrandId());
        }
        if(bo.getSpecialHallId() != null){
            criteria.andCmaServiceLike("%"+ bo.getSpecialHallId() +",%");
        }
        if(bo.getServiceId() != null){
            criteria.andCmaServiceQueryLike("%"+ bo.getServiceId() +"%");
        }

        //使用PageHelper
        Page<Cinema> page = PageHelper.startPage(bo.getCurrentIndex(), bo.getPageSize());

        // 使用cinemaMapper
        cinemaQueryListVO.setCinemas(cinemaMapper.selectByExample(cinemaExample));

        bo.setRecordTotal(page.getTotal());
        bo.setPageTotal(page.getPages());

        // 把bo放入vo，这样可以返回到前端，支持分页数据
        cinemaQueryListVO.setBo(bo);

        // 查询完数据库后，别忘记更新Redis
        redisUntil.set(key, cinemaQueryListVO, 7200);

        return cinemaQueryListVO;
    }

    @Override
    public CinemaQueryModelVO CinemaQueryModel(Integer cmaId) {

        String key = "CinemaQueryModel -- " + cmaId;

        // 需要代码缓存的就不要注释
        redisUntil.del(key);

        Object objCinema = redisUntil.get(key);

        if(objCinema != null){
            logger.info("已经从缓存中加载数据：" + key);
            return (CinemaQueryModelVO) objCinema;
        }

        CinemaQueryModelVO cinemaQueryModelVO = new CinemaQueryModelVO();
        // 根据电影院id获取电影院实体信息
        Cinema cinema = cinemaMapper.selectByPrimaryKey(cmaId);
        // 需要把电影院中的json数据转换成List集合
        cinema.setSpecials(JsonUtil.decodeJsonToList(cinema.getCmaSepcial(), CinemaSpecial.class));
        cinema.setServices(JsonUtil.decodeJsonToList(cinema.getCmaService(), org.bwf.study.model.CinemaService.class));

        cinemaQueryModelVO.setCinema(cinema);

        // 根据电影院的ID去查询 相关影片的ID
        CinemaFilmRelExample cinemaFilmRelExample = new CinemaFilmRelExample();
        cinemaFilmRelExample.createCriteria().andCmaIdEqualTo(cmaId);
        // 获得电影院和影片的关系列表
        List<CinemaFilmRel> cinemaFilmRelList = cinemaFilmRelMapper.selectByExample(cinemaFilmRelExample);
        List<Integer> filmIds = new ArrayList<>();
        cinemaFilmRelList.forEach(item -> {
            filmIds.add(item.getFilmId());
        });

        // 根据影片ID集合获取影片列表
        FilmExample filmExample = new FilmExample();
        // select film_name from film where film_id in (1,2,3,4,5)
        filmExample.createCriteria().andFilmIdIn(filmIds);

        List<FilmWithBLOBs> filmWithBLOBsList = filmMapper.selectByExampleWithBLOBs(filmExample);

        // 获取影片场次的列表
        WatchTimesExample watchTimesExample = new WatchTimesExample();
        watchTimesExample.createCriteria().andCmaIdEqualTo(cmaId).andFilmIdIn(filmIds);
        List<WatchTimes> watchTimesList = watchTimesMapper.selectByExample(watchTimesExample);

        // 每部影片中的json字符串需要转换
        // 这里是lambada表达式， item就是代表遍历时候的每一步影片实体信息
        filmWithBLOBsList.forEach(item -> {
            item.setFilmAdvances(JsonUtil.decodeJsonToList(item.getFilmAdvance(), FilmAdvance.class));
            item.setFilmImges(JsonUtil.decodeJsonToList(item.getFilmImgs(), FilmImgs.class));
            item.setFilmAttributes(JsonUtil.decodeJsonToList(item.getFilmAttribute(), FilmAttribute.class));
            item.setFilmActores(JsonUtil.decodeJsonToList(item.getFilmActors(), FilmActor.class));
            item.setFilmAwardes(JsonUtil.decodeJsonToList(item.getFilmAwards(), FilmAward.class));
            // filter类似循环遍历 -- 最终的结果是筛选，只是需要填写筛选条件， lambda表达式
            item.setWatchTimes(watchTimesList.stream().filter(watch -> watch.getFilmId().equals(item.getFilmId())).collect(Collectors.toList()));
        });


        cinemaQueryModelVO.setFilms(filmWithBLOBsList);

        // 更新缓存
        redisUntil.set(key, cinemaQueryModelVO, 7200);

        return cinemaQueryModelVO;
    }
}
