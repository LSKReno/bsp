package com.bsp.server.mapper;

import com.bsp.server.domain.GoaGovernmentArea;
import com.bsp.server.domain.GoaGovernmentAreaExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoaGovernmentAreaMapper {
    long countByExample(GoaGovernmentAreaExample example);

    int deleteByExample(GoaGovernmentAreaExample example);

    int deleteByPrimaryKey(Integer goaId);

    int insert(GoaGovernmentArea record);

    int insertSelective(GoaGovernmentArea record);

    GoaGovernmentArea selectOneByExample(GoaGovernmentAreaExample example);

    GoaGovernmentArea selectOneByExampleSelective(@Param("example") GoaGovernmentAreaExample example, @Param("selective") GoaGovernmentArea.Column ... selective);

    List<GoaGovernmentArea> selectByExampleSelective(@Param("example") GoaGovernmentAreaExample example, @Param("selective") GoaGovernmentArea.Column ... selective);

    List<GoaGovernmentArea> selectByExample(GoaGovernmentAreaExample example);

    GoaGovernmentArea selectByPrimaryKeySelective(@Param("goaId") Integer goaId, @Param("selective") GoaGovernmentArea.Column ... selective);

    GoaGovernmentArea selectByPrimaryKey(Integer goaId);

    int updateByExampleSelective(@Param("record") GoaGovernmentArea record, @Param("example") GoaGovernmentAreaExample example);

    int updateByExample(@Param("record") GoaGovernmentArea record, @Param("example") GoaGovernmentAreaExample example);

    int updateByPrimaryKeySelective(GoaGovernmentArea record);

    int updateByPrimaryKey(GoaGovernmentArea record);
}