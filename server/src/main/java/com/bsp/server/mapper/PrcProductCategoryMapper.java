package com.bsp.server.mapper;

import com.bsp.server.domain.PrcProductCategory;
import com.bsp.server.domain.PrcProductCategoryExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PrcProductCategoryMapper {
    long countByExample(PrcProductCategoryExample example);

    int deleteByExample(PrcProductCategoryExample example);

    int deleteByPrimaryKey(Integer prcId);

    int insert(PrcProductCategory record);

    int insertSelective(PrcProductCategory record);

    int insertSelective(Map<String,Object> mp); //根据map插入

    PrcProductCategory selectOneByExample(PrcProductCategoryExample example);

    PrcProductCategory selectOneByExampleSelective(@Param("example") PrcProductCategoryExample example, @Param("selective") PrcProductCategory.Column ... selective);

    List<PrcProductCategory> selectByExampleSelective(@Param("example") PrcProductCategoryExample example, @Param("selective") PrcProductCategory.Column ... selective);

    List<PrcProductCategory> selectByExample(PrcProductCategoryExample example);

    PrcProductCategory selectByPrimaryKeySelective(@Param("prcId") Integer prcId, @Param("selective") PrcProductCategory.Column ... selective);

    PrcProductCategory selectByPrimaryKey(Integer prcId);

    int updateByExampleSelective(@Param("record") PrcProductCategory record, @Param("example") PrcProductCategoryExample example);

    int updateByExample(@Param("record") PrcProductCategory record, @Param("example") PrcProductCategoryExample example);

    int updateByPrimaryKeySelective(PrcProductCategory record);

    int updateByPrimaryKey(PrcProductCategory record);

    int updateByPrimaryKeySelective(Map<String,Object> mp); //根据map中的prc_id更新

    List<Map<String,Object>> list(Map<String,Object> mp);
}