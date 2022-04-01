package org.bwf.study.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bwf.study.model.Orders;
import org.bwf.study.model.OrdersExample;

public interface OrdersMapper {
    long countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(String orderNo);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(String orderNo);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}