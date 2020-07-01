package com.bsp.server.mapper;

import com.bsp.server.domain.DrpDropshipPrice;
import com.bsp.server.domain.DrpDropshipPriceExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrpDropshipPriceMapper {
    long countByExample(DrpDropshipPriceExample example);

    int deleteByExample(DrpDropshipPriceExample example);

    int deleteByPrimaryKey(Integer drpId);

    int insert(DrpDropshipPrice record);

    int insertSelective(DrpDropshipPrice record);

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