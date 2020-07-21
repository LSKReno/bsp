package com.bsp.server.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bsp.server.constant.RoleConstant;
import com.bsp.server.domain.*;
import com.bsp.server.dto.SysMenuDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.mapper.SysMenuMapper;
import com.bsp.server.mapper.SysRoleMenuMapper;
import com.bsp.server.mapper.SysUserMapper;
import com.bsp.server.util.CopyUtil;
import com.github.pagehelper.Constant;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
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
    public JSONArray getMenuByRights(Integer userId) {
        SysUserExample sysUserExample = new SysUserExample();
        sysUserExample.createCriteria().andUserIdEqualTo(userId);
        SysUser sysUser = sysUserMapper.selectOneByExample(sysUserExample);

        String roleId = sysUser.getRoleId();

        SysRoleMenuExample sysRoleMenuExample = new SysRoleMenuExample();
        sysRoleMenuExample.createCriteria()
                .andRoleIdEqualTo(Integer.valueOf(roleId))
                .andDeletedEqualTo(false);
        List<SysRoleMenu> sysRoleMenuList = sysRoleMenuMapper.selectByExample(sysRoleMenuExample);

        // 拿到该角色所有的 menuId
        List<Integer> menuIdList = new ArrayList<>();
        for (SysRoleMenu sysRoleMenu : sysRoleMenuList) {
            Integer menuId = sysRoleMenu.getMenuId();
            menuIdList.add(menuId);
        }

        SysMenuExample sysMenuExample = new SysMenuExample();
        sysMenuExample.createCriteria().andMenuIdIn(menuIdList);
        List<SysMenu> sysMenuList = sysMenuMapper.selectByExample(sysMenuExample);

        JSONArray jsonArray = new JSONArray();

        SysMenu sysMenu404 = new SysMenu();


        // 遍历所有菜单
        for (SysMenu sysMenu : sysMenuList) {

//            if (sysMenu.getMenuKey().equals("404")) {
//                sysMenu404 = sysMenu;
//            } else {
//                JSONObject menuObject = new JSONObject();
//                // 等于1则说明是dashboard，mvo，bvo的父级
//                if (sysMenu.getParentId().equals("0")) {
//                    menuObject = generateMenuJSONObject(sysMenu);
//
//                    Integer menuId = sysMenu.getMenuId();
//                    JSONArray children = new JSONArray();
//                    for (SysMenu sysMenuChild : sysMenuList) {
////                        if (Integer.valueOf(sysMenuChild.getParentId()).equals(menuId)) {
//                            JSONObject childMenuObject = generateMenuJSONObject(sysMenuChild);
//                            children.add(childMenuObject);
////                        }
//                    }
//                    menuObject.put("children", children);
//                    jsonArray.add(menuObject);
//                }
//            }
//            JSONObject menuObject = generateMenuJSONObject(sysMenu);

            jsonArray.add(sysMenu.getMenuName());

        }
//        jsonArray.add(sysMenu404);

        return jsonArray;
    }

    public JSONObject generateMenuJSONObject(SysMenu sysMenu) {
        JSONObject menuObject = new JSONObject();
        menuObject.put("id", sysMenu.getMenuId());
        menuObject.put("title", sysMenu.getMenuTitle());
        menuObject.put("key", sysMenu.getMenuKey());
        menuObject.put("name", sysMenu.getMenuName());
        menuObject.put("component", sysMenu.getComponent());
        menuObject.put("path", sysMenu.getMenuUrl());
        menuObject.put("parentId", Integer.valueOf(sysMenu.getParentId()));
        if (sysMenu.getMenuRedirect() != null) {
            menuObject.put("redirect", sysMenu.getMenuRedirect());
        }
        menuObject.put("children", new JSONArray());
        return menuObject;
    }

}
