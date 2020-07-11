package com.bsp.server.mapper;

import com.bsp.server.domain.SysRoleMenu;
import com.bsp.server.domain.SysRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMenuMapper {
    long countByExample(SysRoleMenuExample example);

    int deleteByExample(SysRoleMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleMenu record);

    int insertSelective(SysRoleMenu record);

    SysRoleMenu selectOneByExample(SysRoleMenuExample example);

    SysRoleMenu selectOneByExampleSelective(@Param("example") SysRoleMenuExample example, @Param("selective") SysRoleMenu.Column ... selective);

    List<SysRoleMenu> selectByExampleSelective(@Param("example") SysRoleMenuExample example, @Param("selective") SysRoleMenu.Column ... selective);

    List<SysRoleMenu> selectByExample(SysRoleMenuExample example);

    SysRoleMenu selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SysRoleMenu.Column ... selective);

    SysRoleMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuExample example);

    int updateByExample(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuExample example);

    int updateByPrimaryKeySelective(SysRoleMenu record);

    int updateByPrimaryKey(SysRoleMenu record);
}