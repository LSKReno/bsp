package com.bsp.server.service;

import com.bsp.server.domain.SysRole;
import com.bsp.server.domain.SysRoleExample;
import com.bsp.server.dto.SysRoleDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.mapper.SysRoleMapper;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.util.UuidUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        SysRoleExample sysRoleExample = new SysRoleExample();
        List<SysRole> sysRoleList = sysRoleMapper.selectByExample(sysRoleExample);
        PageInfo<SysRole> pageInfo = new PageInfo<>(sysRoleList);
        pageDto.setTotal(pageInfo.getTotal());
        List<SysRoleDto> sysRoleDtoList = CopyUtil.copyList(sysRoleList, SysRoleDto.class);
        pageDto.setList(sysRoleDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(SysRoleDto sysRoleDto) {
        SysRole sysRole = CopyUtil.copy(sysRoleDto, SysRole.class);
        if (StringUtils.isEmpty(sysRoleDto.getId())) {
            this.insert(sysRole);
        } else {
            this.update(sysRole);
        }
    }

    /**
     * 新增
     */
    private void insert(SysRole sysRole) {
        sysRoleMapper.insert(sysRole);
    }

    /**
     * 更新
     */
    private void update(SysRole sysRole) {
        sysRoleMapper.updateByPrimaryKey(sysRole);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        sysRoleMapper.deleteByPrimaryKey(id);
    }
}
