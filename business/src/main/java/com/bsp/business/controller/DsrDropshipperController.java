package com.bsp.business.controller;

import com.bsp.server.dto.DsrDropshipperDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.DsrDropshipperService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/dsrDropshipper")
public class DsrDropshipperController {

    private static final Logger LOG = LoggerFactory.getLogger(DsrDropshipperController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private DsrDropshipperService dsrDropshipperService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        dsrDropshipperService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody DsrDropshipperDto dsrDropshipperDto) {
        // 保存校验
        ValidatorUtil.require(dsrDropshipperDto.getDsrId(), "主键");
        ValidatorUtil.length(dsrDropshipperDto.getName(), "借卖方名称", 1, 45);
        ValidatorUtil.length(dsrDropshipperDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(dsrDropshipperDto.getLastUpdateBy(), "修改人", 1, 20);
        ValidatorUtil.length(dsrDropshipperDto.getRemark(), "备注", 1, 50);

        ResponseDto responseDto = new ResponseDto();
        dsrDropshipperService.save(dsrDropshipperDto);
        responseDto.setContent(dsrDropshipperDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        dsrDropshipperService.delete(id);
        return responseDto;
    }
}
