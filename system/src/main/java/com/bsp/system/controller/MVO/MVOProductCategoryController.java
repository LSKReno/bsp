package com.bsp.system.controller.MVO;

import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.service.*;
import com.bsp.system.config.JwtConfig;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;
@RestController
@RequestMapping("/mvo/productCategory")
public class MVOProductCategoryController {

    @Resource
    private ProProductService proProductService;
    @Resource
    private ImgImageService imgImageService;
    @Resource
    private PrcProductCategoryService prcProductCategoryService;
    @Resource
    private OfpOfferPriceService ofpOfferPriceService;
    @Resource
    private PckPackageInfoService pckPackageInfoService;
    @Resource
    private PdnProductDescritionService pdnProductDescritionService;

    @Resource
    private SysUserService sysUserService;

    private JwtConfig jwtConfig;
    /**
     * 列表查询，根据man_id，（title）
     * 商品分类&主图
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody Map<String,Object> mp) {
        ResponseDto responseDto = new ResponseDto();
        PageDto pageDto=new PageDto();
        pageDto.setPage((int)mp.get("page"));
        pageDto.setSize((int)mp.get("size"));
        SysUserDto sysUserDto=sysUserService.selectByPrimaryKey(Integer.parseInt(mp.get("userId").toString()));
        mp.put("manId",sysUserDto.getManBuyerId());
        prcProductCategoryService.list(pageDto,mp);
        if(pageDto.getTotal()==0){
            responseDto.setSuccess(false);
        }
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     *更新商品分类&主图
     */
    @PostMapping("/update")
    public ResponseDto update(@RequestBody Map<String,Object> mp){
        ResponseDto responseDto = new ResponseDto();
        Date dt=new Date();
        mp.put("lastUpdateDate",dt);
        int f1=prcProductCategoryService.updateByPrimaryKeySelective(mp); //更新并查出对应的pro_id
        int f2=proProductService.updateByPrimaryKeySelective(mp);
        int f4=ofpOfferPriceService.updateSelective(mp);
        int f5=pckPackageInfoService.updateSelective(mp);
        int f6=pdnProductDescritionService.updateSelective(mp);
        mp.put("entityId",mp.get("proId"));
        mp.put("deleted", "0");
        int f3=imgImageService.updateSelective(mp);
        if(f3==0){
            mp.put("createdBy",mp.get("lastUpdateBy"));
            mp.put("creationDate",dt);
            mp.remove("lastUpdateDate");
            mp.remove("lastUpdateBy");
            f3=imgImageService.insertSelective(mp);
        }
        if(f1==0&&f2==0&&f3==0&&f4==0&&f5==0&&f6==0){
            responseDto.setSuccess(false);
        }
        return responseDto;
    }

    /**
     *插入商品分类&主图
     */
    @PostMapping("/insert")
    public ResponseDto insert(@RequestBody Map<String,Object> mp) {
        ResponseDto responseDto = new ResponseDto();
        mp.put("creationDate", new Date());
        mp.put("deleted", "0");
        SysUserDto sysUserDto=sysUserService.selectByPrimaryKey(Integer.parseInt(mp.get("userId").toString()));
        mp.put("manId",sysUserDto.getManBuyerId());
        int f1 = proProductService.insertSelective(mp); //插入并返回最新的pro_id，以便填写prc表
        int f2 = prcProductCategoryService.insertSelective(mp);
        int f4=ofpOfferPriceService.insertSelective(mp);
        int f5=pckPackageInfoService.insertSelective(mp);
        int f6=pdnProductDescritionService.insertSelective(mp);
        mp.put("entityId",mp.get("proId"));
        int f3=imgImageService.insertSelective(mp);

        if (f1 == 0 ||f2 == 0 || f3 == 0 ||f4== 0 ||f5 == 0 || f6 == 0 ) {
            responseDto.setSuccess(false);
        }
        return responseDto;
    }

    /**
     *逻辑删除分类&主图
     * 不可以将商品信息连带删除
     */
    @PostMapping("/delete")
    public ResponseDto delete(@RequestBody Map<String,Object> mp){
        ResponseDto responseDto = new ResponseDto();
        mp.put("lastUpdateDate",new Date());
        mp.put("deleted","1");
        mp.put("stsCd","D");
        int f1=prcProductCategoryService.updateByPrimaryKeySelective(mp);
        mp.put("entityId",mp.get("proId"));
        int f2=imgImageService.updateSelective(mp);
        if(f1==0||f2==0){
            responseDto.setSuccess(false);
        }
        return responseDto;
    }

}
