package com.bsp.server.mapper;

import com.bsp.server.domain.OfpOfferPrice;
import com.bsp.server.domain.OfpOfferPriceExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfpOfferPriceMapper {
    long countByExample(OfpOfferPriceExample example);

    int deleteByExample(OfpOfferPriceExample example);

    int deleteByPrimaryKey(Integer ofpId);

    int insert(OfpOfferPrice record);

    int insertSelective(OfpOfferPrice record);

    OfpOfferPrice selectOneByExample(OfpOfferPriceExample example);

    OfpOfferPrice selectOneByExampleSelective(@Param("example") OfpOfferPriceExample example, @Param("selective") OfpOfferPrice.Column ... selective);

    List<OfpOfferPrice> selectByExampleSelective(@Param("example") OfpOfferPriceExample example, @Param("selective") OfpOfferPrice.Column ... selective);

    List<OfpOfferPrice> selectByExample(OfpOfferPriceExample example);

    OfpOfferPrice selectByPrimaryKeySelective(@Param("ofpId") Integer ofpId, @Param("selective") OfpOfferPrice.Column ... selective);

    OfpOfferPrice selectByPrimaryKey(Integer ofpId);

    int updateByExampleSelective(@Param("record") OfpOfferPrice record, @Param("example") OfpOfferPriceExample example);

    int updateByExample(@Param("record") OfpOfferPrice record, @Param("example") OfpOfferPriceExample example);

    int updateByPrimaryKeySelective(OfpOfferPrice record);

    int updateByPrimaryKey(OfpOfferPrice record);
}