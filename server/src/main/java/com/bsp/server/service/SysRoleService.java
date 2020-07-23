package com.bsp.server.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bsp.server.domain.*;
import com.bsp.server.dto.SysRoleDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.mapper.SysMenuMapper;
import com.bsp.server.mapper.SysRoleMapper;
import com.bsp.server.mapper.SysRoleMenuMapper;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.util.UuidUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Resource
    private SysRoleMenuMapper sysRoleMenuMapper;

    @Resource
    private SysMenuMapper sysMenuMapper;

    /**
     * 列表查询
     */
    public void list(JSONObject resObject) {
        SysRoleExample sysRoleExample = new SysRoleExample();
        List<String> canSeeRoleList = new ArrayList<>();
        canSeeRoleList.add("admin");
        canSeeRoleList.add("superAdmin");
        sysRoleExample.createCriteria().andRoleNameNotIn(canSeeRoleList);
        List<SysRole> sysRoleList = sysRoleMapper.selectByExample(sysRoleExample);

        JSONArray resArray = new JSONArray();
        for (SysRole sysRole : sysRoleList) {
            JSONObject sysRoleObject = new JSONObject();
            Integer roleId = sysRole.getId();
            sysRoleObject.put("id", roleId);
            sysRoleObject.put("roleName", sysRole.getRoleName());
            sysRoleObject.put("description", sysRole.getDescription());

            List<Integer> constantMenuIdList = new ArrayList<>();
            constantMenuIdList.add(1);
            constantMenuIdList.add(2);
            constantMenuIdList.add(3);
            constantMenuIdList.add(4);
            constantMenuIdList.add(38);
            constantMenuIdList.add(39);
            constantMenuIdList.add(40);
            constantMenuIdList.add(41);
            constantMenuIdList.add(42);
            constantMenuIdList.add(43);
            constantMenuIdList.add(44);
            constantMenuIdList.add(45);
            constantMenuIdList.add(46);
            constantMenuIdList.add(47);
            constantMenuIdList.add(48);
            constantMenuIdList.add(49);
            SysRoleMenuExample sysRoleMenuExample = new SysRoleMenuExample();
            sysRoleMenuExample.createCriteria()
                    .andRoleIdEqualTo(roleId)
                    .andMenuIdNotIn(constantMenuIdList);
            List<SysRoleMenu> sysRoleMenuList = sysRoleMenuMapper.selectByExample(sysRoleMenuExample);

            JSONArray permissionList = new JSONArray();
            for (SysRoleMenu sysRoleMenu : sysRoleMenuList) {
                SysMenuExample sysMenuExample = new SysMenuExample();
                sysMenuExample.createCriteria()
                        .andMenuIdEqualTo(sysRoleMenu.getMenuId());
                SysMenu sysMenu = sysMenuMapper.selectOneByExample(sysMenuExample);

                JSONObject sysMenuObject = new JSONObject();
                sysMenuObject.put("menuId", sysMenu.getMenuId());
                sysMenuObject.put("menuName", sysMenu.getMenuName());

                // 注意这里的是sysRoleMenu的
                sysMenuObject.put("deleted", sysRoleMenu.getDeleted() ? 1 : 0);
                permissionList.add(sysMenuObject);
            }
            sysRoleObject.put("permissions", permissionList);
            resArray.add(sysRoleObject);
        }

        resObject.put("list", resArray);
    }


    /**
     * 更新角色的菜单对应权限
     */
    public void updatePermissions(Integer roleId, ArrayList<String> permissions) {
        SysRoleMenuExample sysRoleMenuExample = new SysRoleMenuExample();
        sysRoleMenuExample.createCriteria().andRoleIdEqualTo(roleId);
        List<SysRoleMenu> sysRoleMenuList = sysRoleMenuMapper.selectByExample(sysRoleMenuExample);

        List<Integer> constantMenuIdList = new ArrayList<>();
        constantMenuIdList.add(1);
        constantMenuIdList.add(2);
        constantMenuIdList.add(3);
        constantMenuIdList.add(4);
        constantMenuIdList.add(38);
        constantMenuIdList.add(39);
        constantMenuIdList.add(40);
        constantMenuIdList.add(41);
        constantMenuIdList.add(42);
        constantMenuIdList.add(43);
        constantMenuIdList.add(44);
        constantMenuIdList.add(45);
        constantMenuIdList.add(46);
        constantMenuIdList.add(47);
        constantMenuIdList.add(48);
        constantMenuIdList.add(49);

        List<Integer> permissionsList = new ArrayList<>();
        for (String permission : permissions) {
            permissionsList.add(Integer.valueOf(permission));
        }

        for (SysRoleMenu sysRoleMenu : sysRoleMenuList) {
            if (constantMenuIdList.contains(sysRoleMenu.getMenuId())) {
                continue;
            }
            if (!permissionsList.contains(sysRoleMenu.getMenuId())) {
                sysRoleMenu.setDeleted(true);
                sysRoleMenuMapper.updateByPrimaryKeySelective(sysRoleMenu);
            } else {
                sysRoleMenu.setDeleted(false);
                sysRoleMenuMapper.updateByPrimaryKeySelective(sysRoleMenu);
            }
        }
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
        sysRoleMapper.updateByPrimaryKeySelective(sysRole);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        sysRoleMapper.deleteByPrimaryKey(id);
    }
}
