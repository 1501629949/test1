package org.bwf.study.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.bwf.obj.bo.FilmQueryBO;
import org.bwf.obj.vo.FilmQueryListVO;
import org.bwf.study.dao.CategoryMapper;
import org.bwf.study.dao.CommentMapper;
import org.bwf.study.dao.FilmMapper;
import org.bwf.study.dao.FilmRegionMapper;
import org.bwf.study.model.*;
import org.bwf.study.service.FilmService;
import org.bwf.study.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private FilmRegionMapper filmRegionMapper;

    @Autowired
    private FilmMapper filmMapper;

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public FilmQueryListVO FilmQueryList(FilmQueryBO bo) {


        FilmQueryListVO filmQueryListVO = new FilmQueryListVO();

        //加载所有的类别信息，填充至VO
        filmQueryListVO.setCategories(categoryMapper.selectByExample(null));
        //加载所有的区域信息，填充至VO
        filmQueryListVO.setFilmRegions(filmRegionMapper.selectByExample(null));

        // 获取影片
        FilmExample filmExample = new FilmExample();
        FilmExample.Criteria criteria = filmExample.createCriteria();
        if(bo.getCateId() != null){
            // select * from film where film_cate_query like '%1,%'
            criteria.andFilmCateQueryLike("%" + bo.getCateId() + ",%");
        }
        if(bo.getRegionId() != null){
            criteria.andFilmRegionQueryLike("%"+ bo.getRegionId() +",%");
        }
        if(bo.getYears() != null ){
            criteria.andFilmYearsEqualTo(bo.getYears());
        }


        // 通过 PageHelper分页组件 获取Page对象
        Page<Film> page = PageHelper.startPage(bo.getCurrentIndex(), bo.getPageSize());

        List<Film> filmList = filmMapper.selectByExample(filmExample);
        // 通过Page对象获取总记录数和总页数
        bo.setRecordTotal(page.getTotal());
        bo.setPageTotal(page.getPages());

        filmQueryListVO.setFilms(filmList);
        filmQueryListVO.setBo(bo);

        return filmQueryListVO;
    }

    @Override
    public FilmWithBLOBs FilmQueryModel(Integer filmId) {

        FilmWithBLOBs filmWithBLOBs = filmMapper.selectByPrimaryKey(filmId);
        filmWithBLOBs.setFilmAdvances(JsonUtil.decodeJsonToList(filmWithBLOBs.getFilmAdvance(), FilmAdvance.class));
        filmWithBLOBs.setFilmImges(JsonUtil.decodeJsonToList(filmWithBLOBs.getFilmImgs(), FilmImgs.class));
        filmWithBLOBs.setFilmAttributes(JsonUtil.decodeJsonToList(filmWithBLOBs.getFilmAttribute(), FilmAttribute.class));
        filmWithBLOBs.setFilmActores(JsonUtil.decodeJsonToList(filmWithBLOBs.getFilmActors(), FilmActor.class));
        filmWithBLOBs.setFilmAwardes(JsonUtil.decodeJsonToList(filmWithBLOBs.getFilmAwards(), FilmAward.class));

        // 处理评论
        CommentExample commentExample = new CommentExample();
        // 如果只有一个where条件，可以直接累加
        commentExample.createCriteria().andFilmIdEqualTo(filmId);
        // 获取评论列表
        filmWithBLOBs.setComments(commentMapper.selectByExample(commentExample));

        return filmWithBLOBs;
    }
}
