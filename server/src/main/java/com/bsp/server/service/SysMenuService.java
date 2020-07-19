package com.bsp.server.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bsp.server.domain.*;
import com.bsp.server.dto.SysMenuDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.mapper.SysMenuMapper;
import com.bsp.server.mapper.SysRoleMenuMapper;
import com.bsp.server.mapper.SysUserMapper;
import com.bsp.server.util.CopyUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
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

        String permissionId = "";
        if (roleId.equals("1")) {
            permissionId = "admin";
        } else if (roleId.equals("2")) {
            permissionId = "bvo";
        } else if (roleId.equals("3")) {
            permissionId = "mvo";
        } else if (roleId.equals("4")) {
            permissionId = "superAdmin";
        }

        SysMenuExample sysMenuExample = new SysMenuExample();
        sysMenuExample.createCriteria().andPermissionIdEqualTo(permissionId);
        List<SysMenu> sysMenuList = sysMenuMapper.selectByExample(sysMenuExample);
        List<SysMenuDto> sysMenuDtoList = CopyUtil.copyList(sysMenuList, SysMenuDto.class);

        JSONArray jsonArray = new JSONArray();

        // 遍历所有菜单
        for (SysMenuDto sysMenuDto : sysMenuDtoList) {
            JSONObject menuObject = new JSONObject();
            menuObject.put("roleId", roleId);
            menuObject.put("permissionName", sysMenuDto.getPermissionName());
            menuObject.put("permissionId", sysMenuDto.getPermissionId());

            jsonArray.add(menuObject);
        }
        System.out.println(roleId);
        System.out.println(permissionId);
        System.out.println(jsonArray);

        return jsonArray;
    }
}
