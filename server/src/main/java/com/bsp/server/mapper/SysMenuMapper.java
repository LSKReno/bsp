package com.bsp.server.mapper;

import com.bsp.server.domain.SysMenu;
import com.bsp.server.domain.SysMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuMapper {
    long countByExample(SysMenuExample example);

    int deleteByExample(SysMenuExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectOneByExample(SysMenuExample example);

    SysMenu selectOneByExampleSelective(@Param("example") SysMenuExample example, @Param("selective") SysMenu.Column ... selective);

    List<SysMenu> selectByExampleSelective(@Param("example") SysMenuExample example, @Param("selective") SysMenu.Column ... selective);

    List<SysMenu> selectByExample(SysMenuExample example);

    SysMenu selectByPrimaryKeySelective(@Param("menuId") Integer menuId, @Param("selective") SysMenu.Column ... selective);

    SysMenu selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
}