package com.bsp.system.controller.BVO;

import com.bsp.server.domain.DsrDropshipper;
import com.bsp.server.domain.WitWishlist;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.dto.WitWishlistDto;
import com.bsp.server.service.SysUserService;
import com.bsp.server.service.WitWishlistService;
import com.bsp.server.util.CopyUtil;
import com.bsp.system.config.JwtConfig;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/bvo/wishlist")
public class BVOWishlistController {

    @Resource
    private WitWishlistService witWishlistService;
    @Resource
    private SysUserService sysUserService;

    private JwtConfig jwtConfig;
    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody Map<String,Object> mp) {
        ResponseDto responseDto = new ResponseDto();
        PageDto pageDto=new PageDto();
        pageDto.setPage((int)mp.get("page"));
        pageDto.setSize((int)mp.get("size"));
        SysUserDto sysUserDto=sysUserService.selectByPrimaryKey(Integer.parseInt(mp.get("userId").toString()));
        mp.put("dsrId",sysUserDto.getManBuyerId());
        witWishlistService.list(pageDto,(int)mp.get("dsrId"));
        if(pageDto.getTotal()==0){
            responseDto.setSuccess(false);
        }
        responseDto.setContent(pageDto);
        return responseDto;
    }

    @PostMapping("/delete")
    public ResponseDto delete(@RequestBody WitWishlistDto witWishlistDto){
        ResponseDto responseDto = new ResponseDto();
        WitWishlist witWishlist = CopyUtil.copy(witWishlistDto, WitWishlist.class);
        witWishlist.setDeleted(true);
        int f=witWishlistService.updateByPrimaryKeySelective(witWishlist);
        if (f ==0 ) {
            responseDto.setSuccess(false);
        }
        return responseDto;
    }

    @PostMapping("/insert")
    public ResponseDto insert(@RequestBody WitWishlistDto witWishlistDto){
        ResponseDto responseDto = new ResponseDto();
        WitWishlist witWishlist = CopyUtil.copy(witWishlistDto, WitWishlist.class);
        SysUserDto sysUserDto=sysUserService.selectByPrimaryKey(witWishlist.getDsrId());
        witWishlist.setDsrId(sysUserDto.getManBuyerId());
        witWishlist.setDeleted(false);
        witWishlist.setCreationDate(new Date());
        int f=witWishlistService.insertSelective(witWishlist);
        if (f ==0 ) {
            responseDto.setSuccess(false);
        }
        return responseDto;
    }
}
