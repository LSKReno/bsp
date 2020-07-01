package com.bsp.business.controller;

import com.bsp.server.dto.SdiStoreDropshipItemDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.SdiStoreDropshipItemService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sdiStoreDropshipItem")
public class SdiStoreDropshipItemController {

    private static final Logger LOG = LoggerFactory.getLogger(SdiStoreDropshipItemController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private SdiStoreDropshipItemService sdiStoreDropshipItemService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        sdiStoreDropshipItemService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody SdiStoreDropshipItemDto sdiStoreDropshipItemDto) {
        // 保存校验
        ValidatorUtil.require(sdiStoreDropshipItemDto.getDilId(), "主键id");
        ValidatorUtil.length(sdiStoreDropshipItemDto.getDropshipStatus(), "0-提交 1-上架 2-下架", 1, 2);
        ValidatorUtil.length(sdiStoreDropshipItemDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(sdiStoreDropshipItemDto.getLastUpdateBy(), "更新人", 1, 20);
        ValidatorUtil.length(sdiStoreDropshipItemDto.getRemark(), "备注", 1, 50);

        ResponseDto responseDto = new ResponseDto();
        sdiStoreDropshipItemService.save(sdiStoreDropshipItemDto);
        responseDto.setContent(sdiStoreDropshipItemDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        sdiStoreDropshipItemService.delete(id);
        return responseDto;
    }
}
