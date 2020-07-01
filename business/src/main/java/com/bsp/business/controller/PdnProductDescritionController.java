package com.bsp.business.controller;

import com.bsp.server.dto.PdnProductDescritionDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.PdnProductDescritionService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pdnProductDescrition")
public class PdnProductDescritionController {

    private static final Logger LOG = LoggerFactory.getLogger(PdnProductDescritionController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private PdnProductDescritionService pdnProductDescritionService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        pdnProductDescritionService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody PdnProductDescritionDto pdnProductDescritionDto) {
        // 保存校验
        ValidatorUtil.require(pdnProductDescritionDto.getPdnId(), "主键");
        ValidatorUtil.length(pdnProductDescritionDto.getTypeCd(), "对应master表TEXTTYPE RICH_TEXT - 图文信息 SIMPLE_TEXT - 简单信息，用于 amazon SELLING_POINTS - 卖点，用于 amazon", 1, 50);
        ValidatorUtil.length(pdnProductDescritionDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(pdnProductDescritionDto.getLastUpdateBy(), "修改人", 1, 20);
        ValidatorUtil.length(pdnProductDescritionDto.getRemark(), "备注", 1, 50);

        ResponseDto responseDto = new ResponseDto();
        pdnProductDescritionService.save(pdnProductDescritionDto);
        responseDto.setContent(pdnProductDescritionDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        pdnProductDescritionService.delete(id);
        return responseDto;
    }
}
