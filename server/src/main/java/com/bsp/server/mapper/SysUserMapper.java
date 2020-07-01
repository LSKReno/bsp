package com.bsp.server.mapper;

import com.bsp.server.domain.SysUser;
import com.bsp.server.domain.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectOneByExample(SysUserExample example);

    SysUser selectOneByExampleSelective(@Param("example") SysUserExample example, @Param("selective") SysUser.Column ... selective);

    List<SysUser> selectByExampleSelective(@Param("example") SysUserExample example, @Param("selective") SysUser.Column ... selective);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKeySelective(@Param("userId") Integer userId, @Param("selective") SysUser.Column ... selective);

    SysUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}