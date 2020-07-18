package com.bsp.system.controller.MVO;

import com.alibaba.fastjson.JSONObject;
import com.bsp.server.domain.SysUser;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.service.*;
import com.bsp.system.config.JwtConfig;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

/**
 * 商品信息CRUD，不包括图片，图片在分类&主图中上传
 * 填写完商品信息应自动跳转到分类&主图界面
 */
@RestController
@RequestMapping("/mvo/product")
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
    private PrcProductCategoryService prcProductCategoryService;
    @Resource
    private SysUserService sysUserService;

    private JwtConfig jwtConfig;
    /**
     * 列表查询，根据man_id, (title)
     * 商品信息
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody Map<String,Object> mp, HttpServletRequest request) {
        ResponseDto responseDto = new ResponseDto();
        PageDto pageDto=new PageDto();
        pageDto.setPage((int)mp.get("page"));
        pageDto.setSize((int)mp.get("size"));

        //通过jwt获取用户id
//        String token = request.getHeader(jwtConfig.getHeader());
//        String tokenJSONString = jwtConfig.getSubjectFromToken(token);
//        JSONObject userInfo = JSONObject.parseObject(tokenJSONString);
//        System.out.println(tokenJSONString);
//        System.out.println(userInfo);
        SysUserDto sysUserDto=sysUserService.selectByPrimaryKey(Integer.parseInt(mp.get("userId").toString()));
        mp.put("manId",sysUserDto.getManBuyerId());
        proProductService.list(pageDto,mp);
        if(pageDto.getTotal()==0){
            responseDto.setSuccess(false);
        }
        responseDto.setContent(pageDto);
        return responseDto;
    }


    /**
     *更新商品信息
     * 只更新商品信息页面的内容即可
     */
    @PostMapping("/update")
    public ResponseDto update(@RequestBody Map<String,Object> mp){
        ResponseDto responseDto = new ResponseDto();
        mp.put("lastUpdateDate",new Date());
        int f1=proProductService.updateByPrimaryKeySelective(mp);
        int f2=ofpOfferPriceService.updateSelective(mp);
        int f3=pckPackageInfoService.updateSelective(mp);
        int f4=pdnProductDescritionService.updateSelective(mp);
        if(f1==0&&f2==0&&f3==0&&f4==0){
            responseDto.setSuccess(false);
        }
        return responseDto;

    }

    /**
     *逻辑删除商品信息
     * 还需要把对应的商品分类也删除
     */
    @PostMapping("/delete")
    public ResponseDto delete(@RequestBody Map<String,Object> mp){
        ResponseDto responseDto = new ResponseDto();
        mp.put("lastUpdateDate",new Date());
        mp.put("deleted","1");
        mp.put("stsCd","D");
        int f1=proProductService.updateByPrimaryKeySelective(mp);
        int f2=ofpOfferPriceService.updateSelective(mp);
        int f3=pckPackageInfoService.updateSelective(mp);
        int f4=pdnProductDescritionService.updateSelective(mp);
        int f5=prcProductCategoryService.updateSelective(mp);
        if(f1==0||f2==0||f3==0||f4==0||f5==0){
            responseDto.setSuccess(false);
        }
        return responseDto;

    }

    /**
     *插入商品信息
     * 还需要在商品分类页面插入
     */
    @PostMapping("/insert")
    public ResponseDto insert(@RequestBody Map<String,Object> mp){
        ResponseDto responseDto = new ResponseDto();
        mp.put("creationDate",new Date());
        mp.put("deleted","0");
        mp.put("price",mp.get("retailPrice")); // 售价等于建议零售价
        SysUserDto sysUserDto=sysUserService.selectByPrimaryKey(Integer.parseInt(mp.get("userId").toString()));
        mp.put("manId",sysUserDto.getManBuyerId());
        int f1=proProductService.insertSelective(mp);
        int f2=ofpOfferPriceService.insertSelective(mp);
        int f3=pckPackageInfoService.insertSelective(mp);
        int f4=pdnProductDescritionService.insertSelective(mp);
        int f5=prcProductCategoryService.insertSelective(mp);
        if(f1==0||f2==0||f3==0||f4==0||f5==0){
            responseDto.setSuccess(false);
        }
        return responseDto;
    }






}

