package org.bwf.study.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bwf.study.model.Type;
import org.bwf.study.model.TypeExample;

public interface TypeMapper {
    long countByExample(TypeExample example);

    int deleteByExample(TypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(Type record);

    int insertSelective(Type record);

    List<Type> selectByExample(TypeExample example);

    Type selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") Type record, @Param("example") TypeExample example);

    int updateByExample(@Param("record") Type record, @Param("example") TypeExample example);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
}