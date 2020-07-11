package com.bsp.server.service;

import com.bsp.server.domain.SysRoleMenu;
import com.bsp.server.domain.SysRoleMenuExample;
import com.bsp.server.dto.SysRoleMenuDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.mapper.SysRoleMenuMapper;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.util.UuidUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysRoleMenuService {

    @Resource
    private SysRoleMenuMapper sysRoleMenuMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        SysRoleMenuExample sysRoleMenuExample = new SysRoleMenuExample();
        List<SysRoleMenu> sysRoleMenuList = sysRoleMenuMapper.selectByExample(sysRoleMenuExample);
        PageInfo<SysRoleMenu> pageInfo = new PageInfo<>(sysRoleMenuList);
        pageDto.setTotal(pageInfo.getTotal());
        List<SysRoleMenuDto> sysRoleMenuDtoList = CopyUtil.copyList(sysRoleMenuList, SysRoleMenuDto.class);
        pageDto.setList(sysRoleMenuDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(SysRoleMenuDto sysRoleMenuDto) {
        SysRoleMenu sysRoleMenu = CopyUtil.copy(sysRoleMenuDto, SysRoleMenu.class);
        if (StringUtils.isEmpty(sysRoleMenuDto.getId())) {
            this.insert(sysRoleMenu);
        } else {
            this.update(sysRoleMenu);
        }
    }

    /**
     * 新增
     */
    private void insert(SysRoleMenu sysRoleMenu) {
        sysRoleMenuMapper.insert(sysRoleMenu);
    }

    /**
     * 更新
     */
    private void update(SysRoleMenu sysRoleMenu) {
        sysRoleMenuMapper.updateByPrimaryKey(sysRoleMenu);
    }

    /**
     * 删除
     */
    public void delete(Integer id) {
        sysRoleMenuMapper.deleteByPrimaryKey(id);
    }
}
