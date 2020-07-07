package com.bsp.business.controller;

import com.bsp.server.dto.SysMenuDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.SysMenuService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sysMenu")
public class SysMenuController {

    private static final Logger LOG = LoggerFactory.getLogger(SysMenuController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private SysMenuService sysMenuService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        sysMenuService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody SysMenuDto sysMenuDto) {
        // 保存校验
        ValidatorUtil.require(sysMenuDto.getMenuId(), "主键");
        ValidatorUtil.length(sysMenuDto.getMenuTitle(), "菜单title", 1, 255);
        ValidatorUtil.length(sysMenuDto.getMenuName(), "菜单name", 1, 255);
        ValidatorUtil.length(sysMenuDto.getMenuUrl(), "路径", 1, 255);
        ValidatorUtil.length(sysMenuDto.getParentId(), "父类ID ", 1, 100);
        ValidatorUtil.length(sysMenuDto.getMenuOrder(), "排序标识 ", 1, 100);
        ValidatorUtil.length(sysMenuDto.getMenuIcon(), "菜单图标样式 ", 1, 30);
        ValidatorUtil.length(sysMenuDto.getMenuType(), "菜单类型 ", 1, 10);
        ValidatorUtil.length(sysMenuDto.getMenuRedirect(), "菜单重定向", 1, 255);
        ValidatorUtil.length(sysMenuDto.getMenuMetadata(), "菜单元数据", 1, 255);

        ResponseDto responseDto = new ResponseDto();
        sysMenuService.save(sysMenuDto);
        responseDto.setContent(sysMenuDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        sysMenuService.delete(id);
        return responseDto;
    }
}
