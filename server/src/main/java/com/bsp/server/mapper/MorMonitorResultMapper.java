package com.bsp.server.mapper;

import com.bsp.server.domain.MorMonitorResult;
import com.bsp.server.domain.MorMonitorResultExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MorMonitorResultMapper {
    long countByExample(MorMonitorResultExample example);

    int deleteByExample(MorMonitorResultExample example);

    int deleteByPrimaryKey(Integer morId);

    int insert(MorMonitorResult record);

    int insertSelective(MorMonitorResult record);

    MorMonitorResult selectOneByExample(MorMonitorResultExample example);

    MorMonitorResult selectOneByExampleSelective(@Param("example") MorMonitorResultExample example, @Param("selective") MorMonitorResult.Column ... selective);

    List<MorMonitorResult> selectByExampleSelective(@Param("example") MorMonitorResultExample example, @Param("selective") MorMonitorResult.Column ... selective);

    List<MorMonitorResult> selectByExample(MorMonitorResultExample example);

    MorMonitorResult selectByPrimaryKeySelective(@Param("morId") Integer morId, @Param("selective") MorMonitorResult.Column ... selective);

    MorMonitorResult selectByPrimaryKey(Integer morId);

    int updateByExampleSelective(@Param("record") MorMonitorResult record, @Param("example") MorMonitorResultExample example);

    int updateByExample(@Param("record") MorMonitorResult record, @Param("example") MorMonitorResultExample example);

    int updateByPrimaryKeySelective(MorMonitorResult record);

    int updateByPrimaryKey(MorMonitorResult record);
}