package com.bsp.business.controller;

import com.bsp.server.dto.SysRoleMenuDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.SysRoleMenuService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sysRoleMenu")
public class SysRoleMenuController {

    private static final Logger LOG = LoggerFactory.getLogger(SysRoleMenuController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private SysRoleMenuService sysRoleMenuService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        sysRoleMenuService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody SysRoleMenuDto sysRoleMenuDto) {
        // 保存校验

        ResponseDto responseDto = new ResponseDto();
        sysRoleMenuService.save(sysRoleMenuDto);
        responseDto.setContent(sysRoleMenuDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        sysRoleMenuService.delete(id);
        return responseDto;
    }
}
