package org.bwf.study.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bwf.study.model.SpecialHall;
import org.bwf.study.model.SpecialHallExample;

public interface SpecialHallMapper {
    long countByExample(SpecialHallExample example);

    int deleteByExample(SpecialHallExample example);

    int deleteByPrimaryKey(Integer specialId);

    int insert(SpecialHall record);

    int insertSelective(SpecialHall record);

    List<SpecialHall> selectByExample(SpecialHallExample example);

    SpecialHall selectByPrimaryKey(Integer specialId);

    int updateByExampleSelective(@Param("record") SpecialHall record, @Param("example") SpecialHallExample example);

    int updateByExample(@Param("record") SpecialHall record, @Param("example") SpecialHallExample example);

    int updateByPrimaryKeySelective(SpecialHall record);

    int updateByPrimaryKey(SpecialHall record);
}