package com.bsp.server.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bsp.server.domain.*;
import com.bsp.server.dto.SysMenuDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.SysRoleMenuDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.mapper.SysMenuMapper;
import com.bsp.server.mapper.SysRoleMenuMapper;
import com.bsp.server.mapper.SysUserMapper;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.util.UuidUtil;
import com.bsp.server.util.ValidatorUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Service
public class SysMenuService {

    @Resource
    private SysMenuMapper sysMenuMapper;

    @Resource
    private SysRoleMenuMapper sysRoleMenuMapper;

    @Resource
    private SysUserMapper sysUserMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        SysMenuExample sysMenuExample = new SysMenuExample();
        List<SysMenu> sysMenuList = sysMenuMapper.selectByExample(sysMenuExample);
        PageInfo<SysMenu> pageInfo = new PageInfo<>(sysMenuList);
        pageDto.setTotal(pageInfo.getTotal());
        List<SysMenuDto> sysMenuDtoList = CopyUtil.copyList(sysMenuList, SysMenuDto.class);
        pageDto.setList(sysMenuDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(SysMenuDto sysMenuDto) {
        SysMenu sysMenu = CopyUtil.copy(sysMenuDto, SysMenu.class);
        if (StringUtils.isEmpty(sysMenuDto.getMenuId())) {
            this.insert(sysMenu);
        } else {
            this.update(sysMenu);
        }
    }

    /**
     * 新增
     */
    private void insert(SysMenu sysMenu) {
        sysMenuMapper.insert(sysMenu);
    }

    /**
     * 更新
     */
    private void update(SysMenu sysMenu) {
        sysMenuMapper.updateByPrimaryKey(sysMenu);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        sysMenuMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据权限获取菜单
     */
    public JSONArray getMenuByRights(SysUserDto sysUserDto) {
        SysUserExample sysUserExample = new SysUserExample();
        sysUserExample.createCriteria().andUserIdEqualTo(sysUserDto.getUserId());
        SysUser sysUser = sysUserMapper.selectOneByExample(sysUserExample);

        String roleId = sysUser.getRoleId();

        SysRoleMenuExample sysRoleMenuExample = new SysRoleMenuExample();
        sysRoleMenuExample.createCriteria().andRoleIdEqualTo(Integer.valueOf(roleId));
        List<SysRoleMenu> sysRoleMenuList = sysRoleMenuMapper.selectByExample(sysRoleMenuExample);
        List<SysRoleMenuDto> sysRoleMenuDtoList = CopyUtil.copyList(sysRoleMenuList, SysRoleMenuDto.class);

        JSONArray jsonArray = new JSONArray();

        // 遍历所有菜单
        for (SysRoleMenuDto sysRoleMenuDto : sysRoleMenuDtoList) {
            Integer menuId = sysRoleMenuDto.getMenuId();

            SysMenuExample sysMenuExample = new SysMenuExample();
            sysMenuExample.createCriteria().andMenuIdEqualTo(menuId);
            SysMenu sysMenu = sysMenuMapper.selectOneByExample(sysMenuExample);

            JSONObject menuObject = new JSONObject();
            menuObject.put("title", sysMenu.getMenuTitle());
            menuObject.put("name", sysMenu.getMenuName());
            menuObject.put("path", sysMenu.getMenuUrl());
            menuObject.put("icon", sysMenu.getMenuIcon());
            menuObject.put("parentId", sysMenu.getParentId());
            menuObject.put("menuOrder", sysMenu.getMenuOrder());
            if (sysMenu.getMenuRedirect() != null && sysMenu.getMenuRedirect().length() > 0) {
                menuObject.put("redirect", sysMenu.getMenuRedirect());
            }
            if (sysMenu.getMenuMetadata() != null && sysMenu.getMenuMetadata().length() > 0) {
                menuObject.put("meta", sysMenu.getMenuMetadata());
            }

            jsonArray.add(menuObject);
        }

        return jsonArray;
    }
}
