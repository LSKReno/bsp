package com.bsp.business.controller;

import com.bsp.server.dto.BrdBrandDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.BrdBrandService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/brdBrand")
public class BrdBrandController {

    private static final Logger LOG = LoggerFactory.getLogger(BrdBrandController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private BrdBrandService brdBrandService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        brdBrandService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody BrdBrandDto brdBrandDto) {
        // 保存校验
        ValidatorUtil.require(brdBrandDto.getBrdId(), "主键");
        ValidatorUtil.length(brdBrandDto.getNameEn(), "公司名称（英文）", 1, 100);
        ValidatorUtil.length(brdBrandDto.getNameCn(), "公司名称（中文）", 1, 100);
        ValidatorUtil.length(brdBrandDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(brdBrandDto.getLastUpdateBy(), "更新人 ", 1, 20);
        ValidatorUtil.length(brdBrandDto.getRemark(), "备注 ", 1, 50);

        ResponseDto responseDto = new ResponseDto();
        brdBrandService.save(brdBrandDto);
        responseDto.setContent(brdBrandDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        brdBrandService.delete(id);
        return responseDto;
    }
}
