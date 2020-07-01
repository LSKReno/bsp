package com.bsp.business.controller;

import com.bsp.server.dto.MorMonitorResultDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.MorMonitorResultService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/morMonitorResult")
public class MorMonitorResultController {

    private static final Logger LOG = LoggerFactory.getLogger(MorMonitorResultController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private MorMonitorResultService morMonitorResultService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        morMonitorResultService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody MorMonitorResultDto morMonitorResultDto) {
        // 保存校验
        ValidatorUtil.require(morMonitorResultDto.getMorId(), "主键");
        ValidatorUtil.length(morMonitorResultDto.getClassName(), "类名", 1, 100);
        ValidatorUtil.length(morMonitorResultDto.getJsonString(), "Json字符串", 1, 500);
        ValidatorUtil.length(morMonitorResultDto.getCreateBy(), "创建人", 1, 20);
        ValidatorUtil.length(morMonitorResultDto.getUpdateBy(), "更新人", 1, 20);
        ValidatorUtil.length(morMonitorResultDto.getRemark(), "描述", 1, 50);

        ResponseDto responseDto = new ResponseDto();
        morMonitorResultService.save(morMonitorResultDto);
        responseDto.setContent(morMonitorResultDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        morMonitorResultService.delete(id);
        return responseDto;
    }
}
