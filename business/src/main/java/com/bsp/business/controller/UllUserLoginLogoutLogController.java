package com.bsp.business.controller;

import com.bsp.server.dto.UllUserLoginLogoutLogDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.UllUserLoginLogoutLogService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ullUserLoginLogoutLog")
public class UllUserLoginLogoutLogController {

    private static final Logger LOG = LoggerFactory.getLogger(UllUserLoginLogoutLogController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private UllUserLoginLogoutLogService ullUserLoginLogoutLogService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        ullUserLoginLogoutLogService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody UllUserLoginLogoutLogDto ullUserLoginLogoutLogDto) {
        // 保存校验
        ValidatorUtil.require(ullUserLoginLogoutLogDto.getUllId(), "");
        ValidatorUtil.length(ullUserLoginLogoutLogDto.getUsiId(), "", 1, 255);
        ValidatorUtil.length(ullUserLoginLogoutLogDto.getToken(), "", 1, 255);
        ValidatorUtil.length(ullUserLoginLogoutLogDto.getTerminalType(), "", 1, 255);
        ValidatorUtil.length(ullUserLoginLogoutLogDto.getOperatingType(), "", 1, 255);
        ValidatorUtil.length(ullUserLoginLogoutLogDto.getCreatedBy(), "", 1, 255);
        ValidatorUtil.length(ullUserLoginLogoutLogDto.getCallCnt(), "", 1, 255);
        ValidatorUtil.length(ullUserLoginLogoutLogDto.getRemark(), "", 1, 255);

        ResponseDto responseDto = new ResponseDto();
        ullUserLoginLogoutLogService.save(ullUserLoginLogoutLogDto);
        responseDto.setContent(ullUserLoginLogoutLogDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        ullUserLoginLogoutLogService.delete(id);
        return responseDto;
    }
}
