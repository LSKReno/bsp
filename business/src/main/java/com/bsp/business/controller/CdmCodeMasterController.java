package com.bsp.business.controller;

import com.bsp.server.dto.CdmCodeMasterDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.CdmCodeMasterService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/cdmCodeMaster")
public class CdmCodeMasterController {

    private static final Logger LOG = LoggerFactory.getLogger(CdmCodeMasterController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private CdmCodeMasterService cdmCodeMasterService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        cdmCodeMasterService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody CdmCodeMasterDto cdmCodeMasterDto) {
        // 保存校验
        ValidatorUtil.require(cdmCodeMasterDto.getCdmId(), "主键");
        ValidatorUtil.length(cdmCodeMasterDto.getCodeType(), "字典类型", 1, 16);
        ValidatorUtil.length(cdmCodeMasterDto.getDescription(), "用途描述", 1, 45);
        ValidatorUtil.length(cdmCodeMasterDto.getTypeCd(), "编码", 1, 45);
        ValidatorUtil.length(cdmCodeMasterDto.getCodeVal(), "编码值", 1, 45);
        ValidatorUtil.length(cdmCodeMasterDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(cdmCodeMasterDto.getLastUpdateBy(), "修改人", 1, 20);
        ValidatorUtil.length(cdmCodeMasterDto.getRemark(), "备注", 1, 50);

        ResponseDto responseDto = new ResponseDto();
        cdmCodeMasterService.save(cdmCodeMasterDto);
        responseDto.setContent(cdmCodeMasterDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        cdmCodeMasterService.delete(id);
        return responseDto;
    }
}
