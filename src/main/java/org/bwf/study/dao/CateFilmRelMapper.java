package org.bwf.study.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bwf.study.model.CateFilmRel;
import org.bwf.study.model.CateFilmRelExample;

public interface CateFilmRelMapper {
    long countByExample(CateFilmRelExample example);

    int deleteByExample(CateFilmRelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CateFilmRel record);

    int insertSelective(CateFilmRel record);

    List<CateFilmRel> selectByExample(CateFilmRelExample example);

    CateFilmRel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CateFilmRel record, @Param("example") CateFilmRelExample example);

    int updateByExample(@Param("record") CateFilmRel record, @Param("example") CateFilmRelExample example);

    int updateByPrimaryKeySelective(CateFilmRel record);

    int updateByPrimaryKey(CateFilmRel record);
}