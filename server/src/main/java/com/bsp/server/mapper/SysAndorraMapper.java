package com.bsp.server.mapper;

import com.bsp.server.domain.SysAndorra;
import com.bsp.server.domain.SysAndorraExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAndorraMapper {
    long countByExample(SysAndorraExample example);

    int deleteByExample(SysAndorraExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysAndorra record);

    int insertSelective(SysAndorra record);

    SysAndorra selectOneByExample(SysAndorraExample example);

    SysAndorra selectOneByExampleSelective(@Param("example") SysAndorraExample example, @Param("selective") SysAndorra.Column ... selective);

    List<SysAndorra> selectByExampleSelective(@Param("example") SysAndorraExample example, @Param("selective") SysAndorra.Column ... selective);

    List<SysAndorra> selectByExample(SysAndorraExample example);

    SysAndorra selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SysAndorra.Column ... selective);

    SysAndorra selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysAndorra record, @Param("example") SysAndorraExample example);

    int updateByExample(@Param("record") SysAndorra record, @Param("example") SysAndorraExample example);

    int updateByPrimaryKeySelective(SysAndorra record);

    int updateByPrimaryKey(SysAndorra record);
}