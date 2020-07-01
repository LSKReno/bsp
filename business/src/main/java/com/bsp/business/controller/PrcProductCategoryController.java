package com.bsp.business.controller;

import com.bsp.server.dto.PrcProductCategoryDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.PrcProductCategoryService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/prcProductCategory")
public class PrcProductCategoryController {

    private static final Logger LOG = LoggerFactory.getLogger(PrcProductCategoryController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private PrcProductCategoryService prcProductCategoryService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        prcProductCategoryService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody PrcProductCategoryDto prcProductCategoryDto) {
        // 保存校验
        ValidatorUtil.require(prcProductCategoryDto.getPrcId(), "主键id");
        ValidatorUtil.length(prcProductCategoryDto.getCategoryId(), "分类id", 1, 45);
        ValidatorUtil.length(prcProductCategoryDto.getCategoryName(), "类别名称", 1, 100);
        ValidatorUtil.length(prcProductCategoryDto.getCategoryPath(), "类别全路径如 ce>digital>mp3", 1, 1024);
        ValidatorUtil.length(prcProductCategoryDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(prcProductCategoryDto.getLastUpdateBy(), "修改人", 1, 20);
        ValidatorUtil.length(prcProductCategoryDto.getRemark(), "备注", 1, 50);
        ValidatorUtil.length(prcProductCategoryDto.getPlateformType(), "平台类型,ebay：2，Amazon：1", 1, 2);

        ResponseDto responseDto = new ResponseDto();
        prcProductCategoryService.save(prcProductCategoryDto);
        responseDto.setContent(prcProductCategoryDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        prcProductCategoryService.delete(id);
        return responseDto;
    }
}
