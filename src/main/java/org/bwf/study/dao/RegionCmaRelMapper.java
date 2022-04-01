package org.bwf.study.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bwf.study.model.RegionCmaRel;
import org.bwf.study.model.RegionCmaRelExample;

public interface RegionCmaRelMapper {
    long countByExample(RegionCmaRelExample example);

    int deleteByExample(RegionCmaRelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RegionCmaRel record);

    int insertSelective(RegionCmaRel record);

    List<RegionCmaRel> selectByExample(RegionCmaRelExample example);

    RegionCmaRel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RegionCmaRel record, @Param("example") RegionCmaRelExample example);

    int updateByExample(@Param("record") RegionCmaRel record, @Param("example") RegionCmaRelExample example);

    int updateByPrimaryKeySelective(RegionCmaRel record);

    int updateByPrimaryKey(RegionCmaRel record);
}