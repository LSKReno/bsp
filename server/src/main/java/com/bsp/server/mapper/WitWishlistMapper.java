package com.bsp.server.mapper;

import com.bsp.server.domain.WitWishlist;
import com.bsp.server.domain.WitWishlistExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface WitWishlistMapper {
    long countByExample(WitWishlistExample example);

    int deleteByExample(WitWishlistExample example);

    int deleteByPrimaryKey(Integer witId);

    int insert(WitWishlist record);

    int insertSelective(WitWishlist record);

    WitWishlist selectOneByExample(WitWishlistExample example);

    WitWishlist selectOneByExampleSelective(@Param("example") WitWishlistExample example, @Param("selective") WitWishlist.Column ... selective);

    List<WitWishlist> selectByExampleSelective(@Param("example") WitWishlistExample example, @Param("selective") WitWishlist.Column ... selective);

    List<WitWishlist> selectByExample(WitWishlistExample example);

    WitWishlist selectByPrimaryKeySelective(@Param("witId") Integer witId, @Param("selective") WitWishlist.Column ... selective);

    WitWishlist selectByPrimaryKey(Integer witId);

    int updateByExampleSelective(@Param("record") WitWishlist record, @Param("example") WitWishlistExample example);

    int updateByExample(@Param("record") WitWishlist record, @Param("example") WitWishlistExample example);

    int updateByPrimaryKeySelective(WitWishlist record);

    int updateByPrimaryKey(WitWishlist record);

    List<Map<String,Object>> list(int id);
}