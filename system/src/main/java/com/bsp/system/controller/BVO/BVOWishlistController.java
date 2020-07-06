package com.bsp.system.controller.BVO;

import com.bsp.server.domain.DsrDropshipper;
import com.bsp.server.domain.WitWishlist;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.WitWishlistDto;
import com.bsp.server.service.WitWishlistService;
import com.bsp.server.util.CopyUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/bvo/wishlist")
public class BVOWishlistController {

    @Resource
    private WitWishlistService witWishlistService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(PageDto pageDto, @RequestBody DsrDropshipper dsrDropshipper) {
        ResponseDto responseDto = new ResponseDto();
        witWishlistService.list(pageDto,dsrDropshipper.getDsrId());
        responseDto.setContent(pageDto);
        return responseDto;
    }

    @PostMapping("/delete")
    public ResponseDto delete(@RequestBody WitWishlistDto witWishlistDto){
        ResponseDto responseDto = new ResponseDto();
        WitWishlist witWishlist = CopyUtil.copy(witWishlistDto, WitWishlist.class);
        witWishlist.setDeleted(true);
        int f=witWishlistService.updateSelective(witWishlist);
        if (f > 0 ) {
            responseDto.setCode("200");
        } else {
            responseDto.setSuccess(false);
        }
        return responseDto;
    }

    @PostMapping("/insert")
    public ResponseDto insert(@RequestBody WitWishlistDto witWishlistDto){
        ResponseDto responseDto = new ResponseDto();
        WitWishlist witWishlist = CopyUtil.copy(witWishlistDto, WitWishlist.class);
        witWishlist.setDeleted(false);
        witWishlist.setCreationDate(new Date());
        System.out.println(witWishlist.getCreationDate());
        int f=witWishlistService.insertSelective(witWishlist);
        if (f > 0 ) {
            responseDto.setCode("200");
            System.out.println(responseDto.getCode());
        } else {
            responseDto.setSuccess(false);
        }
        return responseDto;
    }
}
