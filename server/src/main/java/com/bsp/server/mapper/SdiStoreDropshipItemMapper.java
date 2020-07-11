package com.bsp.server.mapper;

import com.bsp.server.domain.SdiStoreDropshipItem;
import com.bsp.server.domain.SdiStoreDropshipItemExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SdiStoreDropshipItemMapper {
    long countByExample(SdiStoreDropshipItemExample example);

    int deleteByExample(SdiStoreDropshipItemExample example);

    int deleteByPrimaryKey(Integer dilId);

    int insert(SdiStoreDropshipItem record);

    int insertSelective(SdiStoreDropshipItem record);

    int insertSelective(Map<String,Object> mp); //根据map插入

    SdiStoreDropshipItem selectOneByExample(SdiStoreDropshipItemExample example);

    SdiStoreDropshipItem selectOneByExampleSelective(@Param("example") SdiStoreDropshipItemExample example, @Param("selective") SdiStoreDropshipItem.Column ... selective);

    List<SdiStoreDropshipItem> selectByExampleSelective(@Param("example") SdiStoreDropshipItemExample example, @Param("selective") SdiStoreDropshipItem.Column ... selective);

    List<SdiStoreDropshipItem> selectByExample(SdiStoreDropshipItemExample example);

    SdiStoreDropshipItem selectByPrimaryKeySelective(@Param("dilId") Integer dilId, @Param("selective") SdiStoreDropshipItem.Column ... selective);

    SdiStoreDropshipItem selectByPrimaryKey(Integer dilId);

    int updateByExampleSelective(@Param("record") SdiStoreDropshipItem record, @Param("example") SdiStoreDropshipItemExample example);

    int updateByExample(@Param("record") SdiStoreDropshipItem record, @Param("example") SdiStoreDropshipItemExample example);

    int updateByPrimaryKeySelective(SdiStoreDropshipItem record);

    int updateByPrimaryKey(SdiStoreDropshipItem record);
}