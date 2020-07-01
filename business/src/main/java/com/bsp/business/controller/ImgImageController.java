package com.bsp.business.controller;

import com.bsp.server.dto.ImgImageDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.ImgImageService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/imgImage")
public class ImgImageController {

    private static final Logger LOG = LoggerFactory.getLogger(ImgImageController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private ImgImageService imgImageService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        imgImageService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody ImgImageDto imgImageDto) {
        // 保存校验
        ValidatorUtil.require(imgImageDto.getImgId(), "主键");
        ValidatorUtil.length(imgImageDto.getName(), "名字", 1, 255);
        ValidatorUtil.length(imgImageDto.getUri(), "图片地址", 1, 512);
        ValidatorUtil.length(imgImageDto.getEntityCd(), "关联自定义的code", 1, 3);
        ValidatorUtil.length(imgImageDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(imgImageDto.getLastUpdateBy(), "修改人", 1, 20);
        ValidatorUtil.length(imgImageDto.getRemark(), "备注", 1, 50);

        ResponseDto responseDto = new ResponseDto();
        imgImageService.save(imgImageDto);
        responseDto.setContent(imgImageDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        imgImageService.delete(id);
        return responseDto;
    }
}
