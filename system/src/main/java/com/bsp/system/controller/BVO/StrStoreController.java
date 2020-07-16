package com.bsp.system.controller.BVO;

import com.alibaba.fastjson.JSON;
import com.bsp.server.domain.SysUser;
import com.bsp.server.dto.*;
import com.bsp.server.service.DsrDropshipperService;
import com.bsp.server.service.EbaEbayAuthorizationService;
import com.bsp.server.service.StrStoreService;
import com.bsp.server.service.SysUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/StrStoreController")
public class StrStoreController {
    @Resource
    private StrStoreService strStoreService;

    @Resource
    private DsrDropshipperService dsrDropshipperService;

    @Resource
    private SysUserService sysUserService;

    @Resource
    private EbaEbayAuthorizationService ebaEbayAuthorizationService;
    @PostMapping("/getOnlineStores")
    public ResponseDto getOnlineStores(@RequestBody SysUserDto sysUserDto){
        ResponseDto responseDto = new ResponseDto();
        if(sysUserDto.getManBuyerId() == null){ // check if the user has input online Store
            responseDto.setSuccess(false);
        }else{
            List<StrStoreDto> strStoreDtoList = strStoreService.selectByDSRId(sysUserDto.getManBuyerId());
            responseDto.setSuccess(true);
            responseDto.setContent(strStoreDtoList);
        }
        return responseDto;
    }
    @PostMapping("/addOnlineStore")
    public ResponseDto addOnlineStore(@RequestBody Map<String, Object> request){
        SysUserDto sysUserDto = JSON.parseObject(JSON.toJSONString(request.get("SysUserDto")), SysUserDto.class);
        StrStoreDto strStoreDto = JSON.parseObject(JSON.toJSONString(request.get("StrStoreDto")), StrStoreDto.class);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        ResponseDto responseDto = new ResponseDto();
        if(sysUserDto.getManBuyerId() == null){
            responseDto.setSuccess(false);
        }else{
            int result5 = strStoreService.save(strStoreDto);
            if(result5 != 0){
                EbaEbayAuthorizationDto ebaEbayAuthorizationDto = new EbaEbayAuthorizationDto();
                ebaEbayAuthorizationDto.setAccountId(Integer.toString(sysUserDto.getUserId()));
                ebaEbayAuthorizationDto.setAppId(""); //unfinish
                ebaEbayAuthorizationDto.setToken(""); //unfinish
                ebaEbayAuthorizationDto.setStsCd("0");
                ebaEbayAuthorizationDto.setStrId(result5);
                ebaEbayAuthorizationDto.setSecretKey(""); //unfinish
                ebaEbayAuthorizationDto.setRemark("none");
                ebaEbayAuthorizationDto.setLastUpdateDate(simpleDateFormat.format(new Date()));
                ebaEbayAuthorizationDto.setLastUpdateBy(sysUserDto.getUsername());
                ebaEbayAuthorizationDto.setExpDate(new Date());
                ebaEbayAuthorizationDto.setDeleted(0);
                ebaEbayAuthorizationDto.setCreationDate(simpleDateFormat.format(new Date()));
                ebaEbayAuthorizationDto.setCreatedBy(sysUserDto.getUsername());
                ebaEbayAuthorizationDto.setCancleDate(new Date());
                ebaEbayAuthorizationDto.setCallCnt(0);
                int result6 = ebaEbayAuthorizationService.save(ebaEbayAuthorizationDto);
                if(result6 != 0){
                    responseDto.setSuccess(true);
                    responseDto.setContent(sysUserDto);
                }else {
                    responseDto.setSuccess(false);
                }
            }else{
                responseDto.setSuccess(false);
            }
        }
        return responseDto;
    }
}
