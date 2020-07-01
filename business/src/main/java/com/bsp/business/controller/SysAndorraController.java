package com.bsp.business.controller;

import com.bsp.server.dto.SysAndorraDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.SysAndorraService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sysAndorra")
public class SysAndorraController {

    private static final Logger LOG = LoggerFactory.getLogger(SysAndorraController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private SysAndorraService sysAndorraService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        sysAndorraService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody SysAndorraDto sysAndorraDto) {
        // 保存校验
        ValidatorUtil.length(sysAndorraDto.getTitle(), "标题", 1, 200);
        ValidatorUtil.length(sysAndorraDto.getContent(), "内容", 1, 200);
        ValidatorUtil.length(sysAndorraDto.getAdurl(), "图片地址", 1, 200);
        ValidatorUtil.length(sysAndorraDto.getPublisher(), "发布人", 1, 50);
        ValidatorUtil.length(sysAndorraDto.getStarttime(), "开始时间", 1, 50);
        ValidatorUtil.length(sysAndorraDto.getEndtime(), "结束时间", 1, 50);
        ValidatorUtil.length(sysAndorraDto.getTourl(), "跳转url地址", 1, 255);

        ResponseDto responseDto = new ResponseDto();
        sysAndorraService.save(sysAndorraDto);
        responseDto.setContent(sysAndorraDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        sysAndorraService.delete(id);
        return responseDto;
    }
}
