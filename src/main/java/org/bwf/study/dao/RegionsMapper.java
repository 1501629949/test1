package org.bwf.study.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bwf.study.model.Regions;
import org.bwf.study.model.RegionsExample;

public interface RegionsMapper {
    long countByExample(RegionsExample example);

    int deleteByExample(RegionsExample example);

    int deleteByPrimaryKey(Integer regionId);

    int insert(Regions record);

    int insertSelective(Regions record);

    List<Regions> selectByExample(RegionsExample example);

    Regions selectByPrimaryKey(Integer regionId);

    int updateByExampleSelective(@Param("record") Regions record, @Param("example") RegionsExample example);

    int updateByExample(@Param("record") Regions record, @Param("example") RegionsExample example);

    int updateByPrimaryKeySelective(Regions record);

    int updateByPrimaryKey(Regions record);
}