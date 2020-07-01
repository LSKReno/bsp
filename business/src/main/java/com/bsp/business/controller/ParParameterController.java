package com.bsp.business.controller;

import com.bsp.server.dto.ParParameterDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.ParParameterService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/parParameter")
public class ParParameterController {

    private static final Logger LOG = LoggerFactory.getLogger(ParParameterController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private ParParameterService parParameterService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        parParameterService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody ParParameterDto parParameterDto) {
        // 保存校验
        ValidatorUtil.require(parParameterDto.getParId(), "主键");
        ValidatorUtil.length(parParameterDto.getParamCd(), "参数主键", 1, 200);
        ValidatorUtil.length(parParameterDto.getParamValue(), "参数值", 1, 500);
        ValidatorUtil.length(parParameterDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(parParameterDto.getLastUpdateBy(), "修改人", 1, 20);
        ValidatorUtil.length(parParameterDto.getRemark(), "备注", 1, 50);

        ResponseDto responseDto = new ResponseDto();
        parParameterService.save(parParameterDto);
        responseDto.setContent(parParameterDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        parParameterService.delete(id);
        return responseDto;
    }
}
