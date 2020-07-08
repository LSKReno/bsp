package com.bsp.server.mapper;

import com.bsp.server.domain.SaoSalesOrder;
import com.bsp.server.domain.SaoSalesOrderExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaoSalesOrderMapper {
    long countByExample(SaoSalesOrderExample example);

    int deleteByExample(SaoSalesOrderExample example);

    int deleteByPrimaryKey(Integer saoId);

    int insert(SaoSalesOrder record);

    int insertSelective(SaoSalesOrder record);

    SaoSalesOrder selectOneByExample(SaoSalesOrderExample example);

    SaoSalesOrder selectOneByExampleSelective(@Param("example") SaoSalesOrderExample example, @Param("selective") SaoSalesOrder.Column ... selective);

    SaoSalesOrder selectOneByExampleWithBLOBs(SaoSalesOrderExample example);

    List<SaoSalesOrder> selectByExampleSelective(@Param("example") SaoSalesOrderExample example, @Param("selective") SaoSalesOrder.Column ... selective);

    List<SaoSalesOrder> selectByExampleWithBLOBs(SaoSalesOrderExample example);

    List<SaoSalesOrder> selectByExample(SaoSalesOrderExample example);

    SaoSalesOrder selectByPrimaryKeySelective(@Param("saoId") Integer saoId, @Param("selective") SaoSalesOrder.Column ... selective);

    SaoSalesOrder selectByPrimaryKey(Integer saoId);

    int updateByExampleSelective(@Param("record") SaoSalesOrder record, @Param("example") SaoSalesOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") SaoSalesOrder record, @Param("example") SaoSalesOrderExample example);

    int updateByExample(@Param("record") SaoSalesOrder record, @Param("example") SaoSalesOrderExample example);

    int updateByPrimaryKeySelective(SaoSalesOrder record);

    int updateByPrimaryKeyWithBLOBs(SaoSalesOrder record);

    int updateByPrimaryKey(SaoSalesOrder record);

    List<SaoSalesOrder> selectByManID(Integer manBuyerId, String ORDER_STS);

    int changeToSHIPPED(Integer saoId);

    List<SaoSalesOrder> selectByStoId(Integer stoId);
}
