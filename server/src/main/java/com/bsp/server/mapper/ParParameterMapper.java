package com.bsp.server.mapper;

import com.bsp.server.domain.ParParameter;
import com.bsp.server.domain.ParParameterExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParParameterMapper {
    long countByExample(ParParameterExample example);

    int deleteByExample(ParParameterExample example);

    int deleteByPrimaryKey(Integer parId);

    int insert(ParParameter record);

    int insertSelective(ParParameter record);

    ParParameter selectOneByExample(ParParameterExample example);

    ParParameter selectOneByExampleSelective(@Param("example") ParParameterExample example, @Param("selective") ParParameter.Column ... selective);

    ParParameter selectOneByExampleWithBLOBs(ParParameterExample example);

    List<ParParameter> selectByExampleSelective(@Param("example") ParParameterExample example, @Param("selective") ParParameter.Column ... selective);

    List<ParParameter> selectByExampleWithBLOBs(ParParameterExample example);

    List<ParParameter> selectByExample(ParParameterExample example);

    ParParameter selectByPrimaryKeySelective(@Param("parId") Integer parId, @Param("selective") ParParameter.Column ... selective);

    ParParameter selectByPrimaryKey(Integer parId);

    int updateByExampleSelective(@Param("record") ParParameter record, @Param("example") ParParameterExample example);

    int updateByExampleWithBLOBs(@Param("record") ParParameter record, @Param("example") ParParameterExample example);

    int updateByExample(@Param("record") ParParameter record, @Param("example") ParParameterExample example);

    int updateByPrimaryKeySelective(ParParameter record);

    int updateByPrimaryKeyWithBLOBs(ParParameter record);

    int updateByPrimaryKey(ParParameter record);
}