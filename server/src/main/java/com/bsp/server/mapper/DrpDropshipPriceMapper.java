package com.bsp.server.mapper;

import com.bsp.server.domain.DrpDropshipPrice;
import com.bsp.server.domain.DrpDropshipPriceExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DrpDropshipPriceMapper {
    long countByExample(DrpDropshipPriceExample example);

    int deleteByExample(DrpDropshipPriceExample example);

    int deleteByPrimaryKey(Integer drpId);

    int insert(DrpDropshipPrice record);

    int insertSelective(DrpDropshipPrice record);

    int insertSelective(Map<String,Object> mp); //根据map插入

    DrpDropshipPrice selectOneByExample(DrpDropshipPriceExample example);

    DrpDropshipPrice selectOneByExampleSelective(@Param("example") DrpDropshipPriceExample example, @Param("selective") DrpDropshipPrice.Column ... selective);

    List<DrpDropshipPrice> selectByExampleSelective(@Param("example") DrpDropshipPriceExample example, @Param("selective") DrpDropshipPrice.Column ... selective);

    List<DrpDropshipPrice> selectByExample(DrpDropshipPriceExample example);

    DrpDropshipPrice selectByPrimaryKeySelective(@Param("drpId") Integer drpId, @Param("selective") DrpDropshipPrice.Column ... selective);

    DrpDropshipPrice selectByPrimaryKey(Integer drpId);

    int updateByExampleSelective(@Param("record") DrpDropshipPrice record, @Param("example") DrpDropshipPriceExample example);

    int updateByExample(@Param("record") DrpDropshipPrice record, @Param("example") DrpDropshipPriceExample example);

    int updateByPrimaryKeySelective(DrpDropshipPrice record);

    int updateByPrimaryKey(DrpDropshipPrice record);
}