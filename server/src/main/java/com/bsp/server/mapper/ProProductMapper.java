package com.bsp.server.mapper;

import com.bsp.server.domain.ManManufacturer;
import com.bsp.server.domain.ProProduct;
import com.bsp.server.domain.ProProductExample;

import java.util.List;
import java.util.Map;

import com.bsp.server.dto.ManManufacturerDto;
import org.apache.ibatis.annotations.Param;

public interface ProProductMapper {
    long countByExample(ProProductExample example);

    int deleteByExample(ProProductExample example);

    int deleteByPrimaryKey(Integer proId);

    int insert(ProProduct record);

    int insertSelective(ProProduct record);

    int insertSelective(Map<String,Object> mp); //根据map插入

    ProProduct selectOneByExample(ProProductExample example);

    ProProduct selectOneByExampleSelective(@Param("example") ProProductExample example, @Param("selective") ProProduct.Column ... selective);

    ProProduct selectOneByExampleWithBLOBs(ProProductExample example);

    List<ProProduct> selectByExampleSelective(@Param("example") ProProductExample example, @Param("selective") ProProduct.Column ... selective);

    List<ProProduct> selectByExampleWithBLOBs(ProProductExample example);

    List<ProProduct> selectByExample(ProProductExample example);

    ProProduct selectByPrimaryKeySelective(@Param("proId") Integer proId, @Param("selective") ProProduct.Column ... selective);

    ProProduct selectByPrimaryKey(Integer proId);

    int updateByExampleSelective(@Param("record") ProProduct record, @Param("example") ProProductExample example);

    int updateByExampleWithBLOBs(@Param("record") ProProduct record, @Param("example") ProProductExample example);

    int updateByExample(@Param("record") ProProduct record, @Param("example") ProProductExample example);

    int updateByPrimaryKeySelective(ProProduct record);

    int updateByPrimaryKeySelective(Map<String,Object> mp); //根据map中的pro_id更新

    int updateByPrimaryKeyWithBLOBs(ProProduct record);

    int updateByPrimaryKey(ProProduct record);

    List<Map<String,Object>> list(Map<String,Object> mp);

    List<Map<String,Object>> listA();

}