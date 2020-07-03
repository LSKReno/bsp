package com.bsp.system.controller.BVO;

import com.bsp.server.domain.SysUser;
import com.bsp.server.dto.*;
import com.bsp.server.service.DsrDropshipperService;
import com.bsp.server.service.EbaEbayAuthorizationService;
import com.bsp.server.service.StrStoreService;
import com.bsp.server.service.SysUserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
    @RequestMapping("/getOnlineStores")
    public ResponseDto getOnlineStores(@RequestBody SysUserDto sysUserDto){
        ResponseDto responseDto = new ResponseDto();
        if(sysUserDto.getManBuyerId() == null){
            responseDto.setSuccess(false);
        }else{
            List<StrStoreDto> strStoreDtoList = strStoreService.selectByDSRId(sysUserDto.getManBuyerId());
            responseDto.setSuccess(true);
            responseDto.setContent(strStoreDtoList);
        }
        return responseDto;
    }
    @RequestMapping("/addOnlineStore")
    public ResponseDto addOnlineStore(@RequestBody SysUserDto sysUserDto, @RequestBody StrStoreDto strStoreDto){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        ResponseDto responseDto = new ResponseDto();
        if(sysUserDto.getManBuyerId() == null){
            DsrDropshipperDto dsrDropshipperDto = new DsrDropshipperDto();
            dsrDropshipperDto.setCreatedBy(sysUserDto.getUsername());
            dsrDropshipperDto.setCallCnt(0);
            dsrDropshipperDto.setCreationDate(simpleDateFormat.format(new Date()));
            dsrDropshipperDto.setStsCd("1");
            dsrDropshipperDto.setRemark("none");
            dsrDropshipperDto.setRegisterDate(simpleDateFormat.format(new Date()));
            dsrDropshipperDto.setName(sysUserDto.getName());
            dsrDropshipperDto.setLastUpdateDate(simpleDateFormat.format(new Date()));
            dsrDropshipperDto.setLastUpdateBy(sysUserDto.getUsername());
            dsrDropshipperDto.setDeleted(0);
            int result = dsrDropshipperService.save(dsrDropshipperDto);
            if(result !=0){
                sysUserDto.setManBuyerId(result);
                int result2 = sysUserService.save(sysUserDto);{
                    if(result2 == 0){
                        responseDto.setSuccess(false);
                    }else{
                        strStoreDto.setDsrId(result);
                        int result3 = strStoreService.save(strStoreDto);
                        if(result3 != 0){
                            EbaEbayAuthorizationDto ebaEbayAuthorizationDto = new EbaEbayAuthorizationDto();
                            ebaEbayAuthorizationDto.setAccountId(Integer.toString(sysUserDto.getUserId()));
                            ebaEbayAuthorizationDto.setAppId("");
                            ebaEbayAuthorizationDto.setToken("");
                            ebaEbayAuthorizationDto.setStsCd("0");
                            ebaEbayAuthorizationDto.setStrId(strStoreDto.getStrId());
                            ebaEbayAuthorizationDto.setSecretKey("");
                            ebaEbayAuthorizationDto.setRemark("none");
                            ebaEbayAuthorizationDto.setLastUpdateDate(simpleDateFormat.format(new Date()));
                            ebaEbayAuthorizationDto.setLastUpdateBy(sysUserDto.getUsername());
                            ebaEbayAuthorizationDto.setExpDate(new Date());
                            ebaEbayAuthorizationDto.setDeleted(0);
                            ebaEbayAuthorizationDto.setCreationDate(simpleDateFormat.format(new Date()));
                            ebaEbayAuthorizationDto.setCreatedBy(sysUserDto.getUsername());
                            ebaEbayAuthorizationDto.setCancleDate(new Date());
                            ebaEbayAuthorizationDto.setCallCnt(0);
                            int result4 = ebaEbayAuthorizationService.save(ebaEbayAuthorizationDto);
                            if(result4 != 0){
                                responseDto.setSuccess(true);
                                responseDto.setContent(sysUserDto);
                            }else {
                                responseDto.setSuccess(false);
                            }

                        }else{
                            responseDto.setSuccess(false);
                        }

                    }
                }
            }else{
                responseDto.setSuccess(false);
            }
        }
        return responseDto;
    }
}
