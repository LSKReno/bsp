package com.bsp.server.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bsp.server.domain.SysMenu;
import com.bsp.server.domain.SysMenuExample;
import com.bsp.server.domain.SysUser;
import com.bsp.server.domain.SysUserExample;
import com.bsp.server.dto.SysMenuDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.mapper.SysMenuMapper;
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
        List<String> rightsList = Arrays.asList(sysUser.getRights().split(","));

        SysMenuExample sysMenuExample = new SysMenuExample();
        List<SysMenu> sysMenuList = sysMenuMapper.selectByExample(sysMenuExample);
        List<SysMenuDto> sysMenuDtoList = CopyUtil.copyList(sysMenuList, SysMenuDto.class);

        List<SysMenuDto> trueSysMenuDtoList = new LinkedList<>();

        // 遍历所有菜单
        for (SysMenuDto sysMenuDto : sysMenuDtoList) {
            if (rightsList.contains(String.valueOf(sysMenuDto.getMenuId()))) {
                trueSysMenuDtoList.add(sysMenuDto);
            }
        }

        JSONArray jsonArray = new JSONArray();
        for (SysMenuDto sysMenuDto : trueSysMenuDtoList) {
            JSONObject menuObject = new JSONObject();
            menuObject.put("title", sysMenuDto.getMenuTitle());
            menuObject.put("name", sysMenuDto.getMenuName());
            menuObject.put("path", sysMenuDto.getMenuUrl());
            if (sysMenuDto.getMenuRedirect() != null && sysMenuDto.getMenuRedirect().length() > 0) {
                menuObject.put("redirect", sysMenuDto.getMenuRedirect());
            }
            if (sysMenuDto.getMenuMetadata() != null && sysMenuDto.getMenuMetadata().length() > 0) {
                menuObject.put("meta", sysMenuDto.getMenuMetadata());
            }

            jsonArray.add(menuObject);
        }
        return jsonArray;
    }
}
