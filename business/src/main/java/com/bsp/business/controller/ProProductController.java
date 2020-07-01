package com.bsp.business.controller;

import com.bsp.server.dto.ProProductDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.ProProductService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/proProduct")
public class ProProductController {

    private static final Logger LOG = LoggerFactory.getLogger(ProProductController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private ProProductService proProductService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        proProductService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody ProProductDto proProductDto) {
        // 保存校验
        ValidatorUtil.require(proProductDto.getProId(), "主键id");
        ValidatorUtil.length(proProductDto.getSkuCd(), "商品sku编码", 1, 8);
        ValidatorUtil.length(proProductDto.getTitle(), "标题", 1, 255);
        ValidatorUtil.length(proProductDto.getUpc(), "upc编码", 1, 15);
        ValidatorUtil.length(proProductDto.getEan(), "ena编码", 1, 13);
        ValidatorUtil.length(proProductDto.getModel(), "型号", 1, 45);
        ValidatorUtil.length(proProductDto.getWarrantyDay(), "保修期（单位有年、月、日）", 1, 45);
        ValidatorUtil.length(proProductDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(proProductDto.getLastUpdateBy(), "修改人", 1, 20);
        ValidatorUtil.length(proProductDto.getRemark(), "备注", 1, 50);
        ValidatorUtil.length(proProductDto.getReplenishmentPeriod(), "补货期（天）", 1, 255);
        ValidatorUtil.length(proProductDto.getKeyWords(), "关键字，预留后续搜索使用", 1, 255);
        ValidatorUtil.length(proProductDto.getTimeUnit(), "保修期单位 1、年 2、月 3、日", 1, 10);

        ResponseDto responseDto = new ResponseDto();
        proProductService.save(proProductDto);
        responseDto.setContent(proProductDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        proProductService.delete(id);
        return responseDto;
    }
}
