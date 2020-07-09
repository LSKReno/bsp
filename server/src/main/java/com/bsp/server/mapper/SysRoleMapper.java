package com.bsp.server.mapper;

import com.bsp.server.domain.SysRole;
import com.bsp.server.domain.SysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMapper {
    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectOneByExample(SysRoleExample example);

    SysRole selectOneByExampleSelective(@Param("example") SysRoleExample example, @Param("selective") SysRole.Column ... selective);

    List<SysRole> selectByExampleSelective(@Param("example") SysRoleExample example, @Param("selective") SysRole.Column ... selective);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SysRole.Column ... selective);

    SysRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}