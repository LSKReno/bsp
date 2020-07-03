package com.bsp.system.controller.MVO;

import com.bsp.server.domain.OfpOfferPrice;
import com.bsp.server.domain.ProProduct;
import com.bsp.server.dto.ManManufacturerDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/mvopro")
public class MVOProductController {
    @Resource
    private ProProductService proProductService;
    @Resource
    private OfpOfferPriceService ofpOfferPriceService;
    @Resource
    private PckPackageInfoService pckPackageInfoService;
    @Resource
    private PdnProductDescritionService pdnProductDescritionService;
    @Resource
    private ImgImageService imgImageService;

    /**
     * 列表查询，根据man_id
     * 商品信息录入，商品分类主图的数据
     */
    @PostMapping("/listByManid")
    public ResponseDto listByManid(@RequestBody PageDto pageDto, @RequestBody ManManufacturerDto manManufacturerDto) {
        ResponseDto responseDto = new ResponseDto();
        proProductService.listByManid(pageDto,manManufacturerDto);
        if(pageDto.getTotal()==0){
            responseDto.setSuccess(false);
        }else{
            responseDto.setCode("200");
        }
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     *更新商品信息
     */
    @PostMapping("/update")
    public ResponseDto update(@RequestBody Map<String,Object> mp){
        ResponseDto responseDto = new ResponseDto();

        int f=proProductService.updateByPrimaryKeySelective(mp);
        if(f==0){
            responseDto.setSuccess(false);
        }else{
            responseDto.setCode("200");
        }
        return responseDto;

    }

    /**
     *插入商品信息
     */
    @PostMapping("/insert")
    public ResponseDto insert(@RequestBody Map<String,Object> mp){
        ResponseDto responseDto = new ResponseDto();
        mp.put("creationDate",new Date());
        mp.put("deleted","0");
        int f1=proProductService.insertSelective(mp);
        mp.put("proId",f1);
        int f2=ofpOfferPriceService.insertSelective(mp);
        int f3=pckPackageInfoService.insertSelective(mp);
        int f4=pdnProductDescritionService.insertSelective(mp);
        int f5=imgImageService.insertSelective(mp);
        if(f1>0&&f2>0&&f3>0&&f4>0&&f5>0){
            responseDto.setCode("200");
        }else{
            responseDto.setSuccess(false);
        }
        return responseDto;
    }






}

