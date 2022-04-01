package org.bwf.study.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bwf.study.model.Cinema;
import org.bwf.study.model.CinemaExample;

public interface CinemaMapper {
    long countByExample(CinemaExample example);

    int deleteByExample(CinemaExample example);

    int deleteByPrimaryKey(Integer cmaId);

    int insert(Cinema record);

    int insertSelective(Cinema record);

    List<Cinema> selectByExample(CinemaExample example);

    Cinema selectByPrimaryKey(Integer cmaId);

    int updateByExampleSelective(@Param("record") Cinema record, @Param("example") CinemaExample example);

    int updateByExample(@Param("record") Cinema record, @Param("example") CinemaExample example);

    int updateByPrimaryKeySelective(Cinema record);

    int updateByPrimaryKey(Cinema record);
}