package com.bsp.business.controller;

import com.bsp.server.dto.WitWishlistDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.WitWishlistService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/witWishlist")
public class WitWishlistController {

    private static final Logger LOG = LoggerFactory.getLogger(WitWishlistController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private WitWishlistService witWishlistService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        witWishlistService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody WitWishlistDto witWishlistDto) {
        // 保存校验
        ValidatorUtil.require(witWishlistDto.getWitId(), "主键id");
        ValidatorUtil.length(witWishlistDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(witWishlistDto.getLastUpdateBy(), "修改人", 1, 20);
        ValidatorUtil.length(witWishlistDto.getRemark(), "备注", 1, 50);

        ResponseDto responseDto = new ResponseDto();
        witWishlistService.save(witWishlistDto);
        responseDto.setContent(witWishlistDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        witWishlistService.delete(id);
        return responseDto;
    }
}
