package com.bsp.server.mapper;

import com.bsp.server.domain.SalSalesOrderLineItem;
import com.bsp.server.domain.SalSalesOrderLineItemExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalSalesOrderLineItemMapper {
    long countByExample(SalSalesOrderLineItemExample example);

    int deleteByExample(SalSalesOrderLineItemExample example);

    int deleteByPrimaryKey(Integer salId);

    int insert(SalSalesOrderLineItem record);

    int insertSelective(SalSalesOrderLineItem record);

    SalSalesOrderLineItem selectOneByExample(SalSalesOrderLineItemExample example);

    SalSalesOrderLineItem selectOneByExampleSelective(@Param("example") SalSalesOrderLineItemExample example, @Param("selective") SalSalesOrderLineItem.Column ... selective);

    List<SalSalesOrderLineItem> selectByExampleSelective(@Param("example") SalSalesOrderLineItemExample example, @Param("selective") SalSalesOrderLineItem.Column ... selective);

    List<SalSalesOrderLineItem> selectByExample(SalSalesOrderLineItemExample example);

    SalSalesOrderLineItem selectByPrimaryKeySelective(@Param("salId") Integer salId, @Param("selective") SalSalesOrderLineItem.Column ... selective);

    SalSalesOrderLineItem selectByPrimaryKey(Integer salId);

    int updateByExampleSelective(@Param("record") SalSalesOrderLineItem record, @Param("example") SalSalesOrderLineItemExample example);

    int updateByExample(@Param("record") SalSalesOrderLineItem record, @Param("example") SalSalesOrderLineItemExample example);

    int updateByPrimaryKeySelective(SalSalesOrderLineItem record);

    int updateByPrimaryKey(SalSalesOrderLineItem record);
}