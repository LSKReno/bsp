package com.bsp.system.controller.BVO;

import com.bsp.server.domain.WitWishlist;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.service.DrpDropshipPriceService;
import com.bsp.server.service.SdiStoreDropshipItemService;
import com.bsp.server.service.SysUserService;
import com.bsp.server.service.WitWishlistService;
import com.bsp.system.config.JwtConfig;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/bvo")
public class BVODropshipPriceController {

    @Resource
    private DrpDropshipPriceService drpDropshipPriceService;
    @Resource
    private SdiStoreDropshipItemService sdiStoreDropshipItemService;
    @Resource
    private WitWishlistService witWishlistService;

//    @Resource
//    private SysUserService sysUserService;
//    private JwtConfig jwtConfig;

    /**
     *借卖
     * 执行之后调用wishlist/list，刷新心愿单
     */
    @PostMapping("/borrow")
    public ResponseDto borrow(@RequestBody Map<String,Object> mp){
        ResponseDto responseDto = new ResponseDto();
        mp.put("deleted","0");
        Date dt=new Date();
        mp.put("creationDate",dt);
        //SysUserDto sysUserDto=sysUserService.selectByPrimaryKey(Integer.parseInt(mp.get("userId").toString()));
        //mp.put("dsrId",sysUserDto.getManBuyerId());
        int f1=drpDropshipPriceService.insertSelective(mp);
        int f2=sdiStoreDropshipItemService.insertSelective(mp);
        if(mp.get("witId")!=null){ //如果witId不为空，说明是从心愿单里借卖的
            WitWishlist witWishlist=new WitWishlist();
            witWishlist.setWitId(new Integer(mp.get("witId").toString()));
            witWishlist.setLastUpdateBy(mp.get("createdBy").toString()); //更新者就是借卖方
            witWishlist.setLastUpdateDate(dt); //更新时间
            witWishlist.setDeleted(true); //从心愿单中删除
            witWishlistService.updateByPrimaryKeySelective(witWishlist);
        }

        if(f1==0||f2==0){
            responseDto.setSuccess(false);
        }
        return responseDto;

    }

}
