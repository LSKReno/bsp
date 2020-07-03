package com.bsp.server.service;

import com.bsp.server.domain.SysUser;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.mapper.SysUserMapper;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.domain.SysUserExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        SysUserExample sysUserExample = new SysUserExample();
        List<SysUser> sysUserList = sysUserMapper.selectByExample(sysUserExample);
        PageInfo<SysUser> pageInfo = new PageInfo<>(sysUserList);
        pageDto.setTotal(pageInfo.getTotal());
        List<SysUserDto> sysUserDtoList = CopyUtil.copyList(sysUserList, SysUserDto.class);
        pageDto.setList(sysUserDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public int save(SysUserDto sysUserDto) {
        SysUser sysUser = CopyUtil.copy(sysUserDto, SysUser.class);
        if (StringUtils.isEmpty(sysUserDto.getUserId())) {
            return this.insert(sysUser);
        } else {
            return this.update(sysUser);
        }
    }

    /**
     * 新增
     */
    private int insert(SysUser sysUser) {
        return sysUserMapper.insert(sysUser);
    }

    /**
     * 更新
     */
    private int update(SysUser sysUser) {

        return sysUserMapper.updateByPrimaryKey(sysUser);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        sysUserMapper.deleteByPrimaryKey(id);
    }
}
