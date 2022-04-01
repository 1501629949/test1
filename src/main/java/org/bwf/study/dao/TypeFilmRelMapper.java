package org.bwf.study.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bwf.study.model.TypeFilmRel;
import org.bwf.study.model.TypeFilmRelExample;

public interface TypeFilmRelMapper {
    long countByExample(TypeFilmRelExample example);

    int deleteByExample(TypeFilmRelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TypeFilmRel record);

    int insertSelective(TypeFilmRel record);

    List<TypeFilmRel> selectByExample(TypeFilmRelExample example);

    TypeFilmRel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TypeFilmRel record, @Param("example") TypeFilmRelExample example);

    int updateByExample(@Param("record") TypeFilmRel record, @Param("example") TypeFilmRelExample example);

    int updateByPrimaryKeySelective(TypeFilmRel record);

    int updateByPrimaryKey(TypeFilmRel record);
}