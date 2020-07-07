package com.bsp.server.service;

import com.bsp.server.domain.SysMenu;
import com.bsp.server.domain.SysMenuExample;
import com.bsp.server.dto.SysMenuDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.mapper.SysMenuMapper;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.util.UuidUtil;
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
}
