package com.bsp.business.controller;

import com.bsp.server.dto.SysUserDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.SysUserService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    private static final Logger LOG = LoggerFactory.getLogger(SysUserController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private SysUserService sysUserService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        sysUserService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody SysUserDto sysUserDto) {
        // 保存校验
        ValidatorUtil.require(sysUserDto.getUserId(), "主键");
        ValidatorUtil.length(sysUserDto.getUsername(), "用户名，唯一", 1, 255);
        ValidatorUtil.length(sysUserDto.getPassword(), "密码", 1, 255);
        ValidatorUtil.length(sysUserDto.getName(), "昵称（可重复）", 1, 255);
        ValidatorUtil.length(sysUserDto.getRights(), "权限", 1, 255);
        ValidatorUtil.length(sysUserDto.getRoleId(), "角色ID", 1, 100);
        ValidatorUtil.length(sysUserDto.getLastLogin(), "上次登录时间", 1, 255);
        ValidatorUtil.length(sysUserDto.getIp(), "登录IP", 1, 100);
        ValidatorUtil.length(sysUserDto.getStatus(), "状态", 1, 32);
        ValidatorUtil.length(sysUserDto.getBz(), "备注", 1, 255);
        ValidatorUtil.length(sysUserDto.getSkin(), "皮肤样式", 1, 100);
        ValidatorUtil.length(sysUserDto.getEmail(), "邮箱", 1, 32);
        ValidatorUtil.length(sysUserDto.getNumber(), "固话号码", 1, 100);
        ValidatorUtil.length(sysUserDto.getPhone(), "手机", 1, 32);

        ResponseDto responseDto = new ResponseDto();
        sysUserService.save(sysUserDto);
        responseDto.setContent(sysUserDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        sysUserService.delete(id);
        return responseDto;
    }
}
