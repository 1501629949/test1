package org.bwf.study.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bwf.study.model.SpicalCinemaRel;
import org.bwf.study.model.SpicalCinemaRelExample;

public interface SpicalCinemaRelMapper {
    long countByExample(SpicalCinemaRelExample example);

    int deleteByExample(SpicalCinemaRelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpicalCinemaRel record);

    int insertSelective(SpicalCinemaRel record);

    List<SpicalCinemaRel> selectByExample(SpicalCinemaRelExample example);

    SpicalCinemaRel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpicalCinemaRel record, @Param("example") SpicalCinemaRelExample example);

    int updateByExample(@Param("record") SpicalCinemaRel record, @Param("example") SpicalCinemaRelExample example);

    int updateByPrimaryKeySelective(SpicalCinemaRel record);

    int updateByPrimaryKey(SpicalCinemaRel record);
}