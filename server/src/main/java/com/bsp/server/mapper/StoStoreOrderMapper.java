package com.bsp.server.mapper;

import com.bsp.server.domain.StoStoreOrder;
import com.bsp.server.domain.StoStoreOrderExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoStoreOrderMapper {
    long countByExample(StoStoreOrderExample example);

    int deleteByExample(StoStoreOrderExample example);

    int deleteByPrimaryKey(Integer stoId);

    int insert(StoStoreOrder record);

    int insertSelective(StoStoreOrder record);

    StoStoreOrder selectOneByExample(StoStoreOrderExample example);

    StoStoreOrder selectOneByExampleSelective(@Param("example") StoStoreOrderExample example, @Param("selective") StoStoreOrder.Column ... selective);

    List<StoStoreOrder> selectByExampleSelective(@Param("example") StoStoreOrderExample example, @Param("selective") StoStoreOrder.Column ... selective);

    List<StoStoreOrder> selectByExample(StoStoreOrderExample example);

    StoStoreOrder selectByPrimaryKeySelective(@Param("stoId") Integer stoId, @Param("selective") StoStoreOrder.Column ... selective);

    StoStoreOrder selectByPrimaryKey(Integer stoId);

    int updateByExampleSelective(@Param("record") StoStoreOrder record, @Param("example") StoStoreOrderExample example);

    int updateByExample(@Param("record") StoStoreOrder record, @Param("example") StoStoreOrderExample example);

    int updateByPrimaryKeySelective(StoStoreOrder record);

    int updateByPrimaryKey(StoStoreOrder record);

    List<StoStoreOrder> selectByStrId(Integer strId);

}
