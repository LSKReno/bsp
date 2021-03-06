package com.bsp.server.mapper;

import com.bsp.server.domain.PckPackageInfo;
import com.bsp.server.domain.PckPackageInfoExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PckPackageInfoMapper {
    long countByExample(PckPackageInfoExample example);

    int deleteByExample(PckPackageInfoExample example);

    int deleteByPrimaryKey(Integer pckId);

    int insert(PckPackageInfo record);

    int insertSelective(PckPackageInfo record);

    int insertSelective(Map<String,Object> mp); //根据map插入

    PckPackageInfo selectOneByExample(PckPackageInfoExample example);

    PckPackageInfo selectOneByExampleSelective(@Param("example") PckPackageInfoExample example, @Param("selective") PckPackageInfo.Column ... selective);

    List<PckPackageInfo> selectByExampleSelective(@Param("example") PckPackageInfoExample example, @Param("selective") PckPackageInfo.Column ... selective);

    List<PckPackageInfo> selectByExample(PckPackageInfoExample example);

    PckPackageInfo selectByPrimaryKeySelective(@Param("pckId") Integer pckId, @Param("selective") PckPackageInfo.Column ... selective);

    PckPackageInfo selectByPrimaryKey(Integer pckId);

    int updateByExampleSelective(@Param("record") PckPackageInfo record, @Param("example") PckPackageInfoExample example);

    int updateByExample(@Param("record") PckPackageInfo record, @Param("example") PckPackageInfoExample example);

    int updateByPrimaryKeySelective(PckPackageInfo record);

    int updateSelective(Map<String,Object> mp); //根据map更新，mapper里直接改的updateByPrimaryKeySelective

    int updateByPrimaryKey(PckPackageInfo record);
}