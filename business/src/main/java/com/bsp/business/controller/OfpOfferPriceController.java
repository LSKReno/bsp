package com.bsp.business.controller;

import com.bsp.server.dto.OfpOfferPriceDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.OfpOfferPriceService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ofpOfferPrice")
public class OfpOfferPriceController {

    private static final Logger LOG = LoggerFactory.getLogger(OfpOfferPriceController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private OfpOfferPriceService ofpOfferPriceService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        ofpOfferPriceService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody OfpOfferPriceDto ofpOfferPriceDto) {
        // 保存校验
        ValidatorUtil.require(ofpOfferPriceDto.getOfpId(), "主键");
        ValidatorUtil.length(ofpOfferPriceDto.getProId(), "商品ID 外键关联pro表 ", 1, 255);
        ValidatorUtil.length(ofpOfferPriceDto.getPrice(), "单价 ", 1, 255);
        ValidatorUtil.length(ofpOfferPriceDto.getTypeCd(), "对应master表的PRICE_TYPE PUB - 公开借卖价 PRO - 促销价 VIP - 专享价 ", 1, 255);
        ValidatorUtil.length(ofpOfferPriceDto.getDsrId(), "借卖方id，关联专享价用，其他类型该字段为空 ", 1, 255);
        ValidatorUtil.length(ofpOfferPriceDto.getCreatedBy(), "创建人 ", 1, 255);
        ValidatorUtil.length(ofpOfferPriceDto.getLastUpdateBy(), "更新人 ", 1, 255);
        ValidatorUtil.length(ofpOfferPriceDto.getCallCnt(), "乐观锁 ", 1, 255);
        ValidatorUtil.length(ofpOfferPriceDto.getRemark(), "备注 ", 1, 255);
        ValidatorUtil.length(ofpOfferPriceDto.getStsCd(), "有效性 ", 1, 255);
        ValidatorUtil.length(ofpOfferPriceDto.getPeriod(), "是否自动设置价格（1为自动以相同价格进入下一个周期） ", 1, 255);

        ResponseDto responseDto = new ResponseDto();
        ofpOfferPriceService.save(ofpOfferPriceDto);
        responseDto.setContent(ofpOfferPriceDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        ofpOfferPriceService.delete(id);
        return responseDto;
    }
}
