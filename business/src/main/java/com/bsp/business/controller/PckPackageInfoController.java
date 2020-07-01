package com.bsp.business.controller;

import com.bsp.server.dto.PckPackageInfoDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.PckPackageInfoService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pckPackageInfo")
public class PckPackageInfoController {

    private static final Logger LOG = LoggerFactory.getLogger(PckPackageInfoController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private PckPackageInfoService pckPackageInfoService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        pckPackageInfoService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody PckPackageInfoDto pckPackageInfoDto) {
        // 保存校验
        ValidatorUtil.require(pckPackageInfoDto.getPckId(), "主键");
        ValidatorUtil.length(pckPackageInfoDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(pckPackageInfoDto.getLastUpdateBy(), "修改人", 1, 20);
        ValidatorUtil.length(pckPackageInfoDto.getRemark(), "备注", 1, 50);
        ValidatorUtil.length(pckPackageInfoDto.getHeavyCargo(), "卡车管道", 1, 2);
        ValidatorUtil.length(pckPackageInfoDto.getLogisticsCompany(), "管道公司", 1, 50);

        ResponseDto responseDto = new ResponseDto();
        pckPackageInfoService.save(pckPackageInfoDto);
        responseDto.setContent(pckPackageInfoDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        pckPackageInfoService.delete(id);
        return responseDto;
    }
}
