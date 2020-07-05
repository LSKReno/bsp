package com.bsp.system.controller.MVO;

import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.ImgImageService;
import com.bsp.server.service.PrcProductCategoryService;
import com.bsp.server.service.ProProductService;
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

    /**
     * 列表查询，根据man_id，（title）
     * 商品分类&主图
     */
    @PostMapping("/list")
    public ResponseDto list(PageDto pageDto, @RequestBody Map<String,Object> mp) {
        ResponseDto responseDto = new ResponseDto();
        prcProductCategoryService.list(pageDto,mp);
        if(pageDto.getTotal()==0){
            responseDto.setSuccess(false);
        }else{
            responseDto.setCode("200");
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
        mp.put("lastUpdateDate",new Date());
        mp.put("deleted","0");
        int f1=prcProductCategoryService.updateByPrimaryKeySelective(mp); //更新并查出对应的pro_id
        int f2=proProductService.updateByPrimaryKeySelective(mp);
        mp.put("entityId",mp.get("proId"));
        int f3=imgImageService.updateSelective(mp);
        if(f1>0&&f2>0&&f3>0){
            responseDto.setCode("200");
        }else{
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
        int f1 = proProductService.insertSelective(mp); //插入并返回最新的pro_id，以便填写prc表
        int f2 = prcProductCategoryService.insertSelective(mp);
        mp.put("entityId",mp.get("proId"));
        int f3=imgImageService.insertSelective(mp);
        if (f1 > 0 && f2 > 0 && f3 > 0 ) {
            responseDto.setCode("200");
        } else {
            responseDto.setSuccess(false);
        }
        return responseDto;
    }

    /**
     *逻辑删除分类&主图
     */
    @PostMapping("/delete")
    public ResponseDto delete(@RequestBody Map<String,Object> mp){
        ResponseDto responseDto = new ResponseDto();
        mp.put("lastUpdateDate",new Date());
        mp.put("deleted","1");
        int f1=proProductService.updateByPrimaryKeySelective(mp);
        int f2=prcProductCategoryService.updateByPrimaryKeySelective(mp);
        mp.put("entityId",mp.get("proId"));
        int f3=imgImageService.updateSelective(mp);
        if(f1>0&&f2>0&&f3>0){
            responseDto.setCode("200");
        }else{
            responseDto.setSuccess(false);
        }
        return responseDto;
    }

}
