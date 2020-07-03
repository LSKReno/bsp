package com.bsp.server.mapper;

import com.bsp.server.domain.StrStore;
import com.bsp.server.domain.StrStoreExample;

import java.util.List;

import com.bsp.server.dto.StrStoreDto;
import org.apache.ibatis.annotations.Param;

public interface StrStoreMapper {
    long countByExample(StrStoreExample example);

    int deleteByExample(StrStoreExample example);

    int deleteByPrimaryKey(Integer strId);

    int insert(StrStore record);

    int insertSelective(StrStore record);

    StrStore selectOneByExample(StrStoreExample example);

    StrStore selectOneByExampleSelective(@Param("example") StrStoreExample example, @Param("selective") StrStore.Column ... selective);

    List<StrStore> selectByExampleSelective(@Param("example") StrStoreExample example, @Param("selective") StrStore.Column ... selective);

    List<StrStore> selectByExample(StrStoreExample example);

    StrStore selectByPrimaryKeySelective(@Param("strId") Integer strId, @Param("selective") StrStore.Column ... selective);

    StrStore selectByPrimaryKey(Integer strId);

    int updateByExampleSelective(@Param("record") StrStore record, @Param("example") StrStoreExample example);

    int updateByExample(@Param("record") StrStore record, @Param("example") StrStoreExample example);

    int updateByPrimaryKeySelective(StrStore record);

    int updateByPrimaryKey(StrStore record);

    List<StrStoreDto> selectByDSRId(Integer dsrId);
}
