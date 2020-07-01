package com.bsp.server.mapper;

import com.bsp.server.domain.SolStoreOrderLineItem;
import com.bsp.server.domain.SolStoreOrderLineItemExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolStoreOrderLineItemMapper {
    long countByExample(SolStoreOrderLineItemExample example);

    int deleteByExample(SolStoreOrderLineItemExample example);

    int deleteByPrimaryKey(Integer solId);

    int insert(SolStoreOrderLineItem record);

    int insertSelective(SolStoreOrderLineItem record);

    SolStoreOrderLineItem selectOneByExample(SolStoreOrderLineItemExample example);

    SolStoreOrderLineItem selectOneByExampleSelective(@Param("example") SolStoreOrderLineItemExample example, @Param("selective") SolStoreOrderLineItem.Column ... selective);

    SolStoreOrderLineItem selectOneByExampleWithBLOBs(SolStoreOrderLineItemExample example);

    List<SolStoreOrderLineItem> selectByExampleSelective(@Param("example") SolStoreOrderLineItemExample example, @Param("selective") SolStoreOrderLineItem.Column ... selective);

    List<SolStoreOrderLineItem> selectByExampleWithBLOBs(SolStoreOrderLineItemExample example);

    List<SolStoreOrderLineItem> selectByExample(SolStoreOrderLineItemExample example);

    SolStoreOrderLineItem selectByPrimaryKeySelective(@Param("solId") Integer solId, @Param("selective") SolStoreOrderLineItem.Column ... selective);

    SolStoreOrderLineItem selectByPrimaryKey(Integer solId);

    int updateByExampleSelective(@Param("record") SolStoreOrderLineItem record, @Param("example") SolStoreOrderLineItemExample example);

    int updateByExampleWithBLOBs(@Param("record") SolStoreOrderLineItem record, @Param("example") SolStoreOrderLineItemExample example);

    int updateByExample(@Param("record") SolStoreOrderLineItem record, @Param("example") SolStoreOrderLineItemExample example);

    int updateByPrimaryKeySelective(SolStoreOrderLineItem record);

    int updateByPrimaryKeyWithBLOBs(SolStoreOrderLineItem record);

    int updateByPrimaryKey(SolStoreOrderLineItem record);
}