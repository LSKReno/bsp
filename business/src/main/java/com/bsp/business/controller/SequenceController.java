package com.bsp.business.controller;

import com.bsp.server.dto.SequenceDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.SequenceService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sequence")
public class SequenceController {

    private static final Logger LOG = LoggerFactory.getLogger(SequenceController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private SequenceService sequenceService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        sequenceService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody SequenceDto sequenceDto) {
        // 保存校验
        ValidatorUtil.length(sequenceDto.getName(), "序列名称", 1, 50);
        ValidatorUtil.length(sequenceDto.getInitial(), "首字母", 1, 10);

        ResponseDto responseDto = new ResponseDto();
        sequenceService.save(sequenceDto);
        responseDto.setContent(sequenceDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        sequenceService.delete(id);
        return responseDto;
    }
}
