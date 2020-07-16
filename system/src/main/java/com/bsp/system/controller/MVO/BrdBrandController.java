package com.bsp.system.controller.MVO;

import com.alibaba.fastjson.JSON;
import com.bsp.server.domain.BrdBrand;
import com.bsp.server.dto.BrdBrandDto;
import com.bsp.server.dto.ManManufacturerDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.service.BrdBrandService;
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
@RequestMapping("/BrdBrandController")
public class BrdBrandController {
    @Resource
    private BrdBrandService brdBrandService;
    @Resource
    private SysUserService sysUserService;
    @PostMapping("/getBrandsList")
    public ResponseDto getBrandsList(@RequestBody ManManufacturerDto manManufacturerDto){
        ResponseDto responseDto = new ResponseDto();
        List<BrdBrandDto> brdBrandDtos = brdBrandService.selectByCompanyId(manManufacturerDto.getManId());
        if(brdBrandDtos == null){
            responseDto.setSuccess(false);
        }else{
            responseDto.setSuccess(true);

            responseDto.setContent(brdBrandDtos);
        }
        return responseDto;
    }
    @PostMapping("/saveBrand")
    public ResponseDto saveBrand(@RequestBody Map<String,Object> request){
        BrdBrandDto brdBrandDto = JSON.parseObject(JSON.toJSONString(request.get("BrdBrandDto")), BrdBrandDto.class);
        Integer userId = JSON.parseObject(JSON.toJSONString(request.get("UserId")), Integer.class);
        SysUserDto sysUserDto = sysUserService.selectByPrimaryKey(userId);
        brdBrandDto.setCreatedBy(sysUserDto.getUsername());
        brdBrandDto.setLastUpdateBy(sysUserDto.getUsername());
        brdBrandDto.setStsCd("0");
        brdBrandDto.setDeleted(0);
        brdBrandDto.setCallCnt(0);
        ResponseDto responseDto = new ResponseDto();
        int result = brdBrandService.save(brdBrandDto);
        if(result == 0){
            responseDto.setSuccess(false);
        }else{
            responseDto.setSuccess(true);
        }
        return responseDto;
    }
    @PostMapping("/removeBrand")
    public ResponseDto removeBrand(@RequestBody Map<String,Object> request){
        ResponseDto responseDto = new ResponseDto();
        BrdBrandDto brdBrandDto = JSON.parseObject(JSON.toJSONString(request.get("BrdBrandDto")), BrdBrandDto.class);
        Integer userId = JSON.parseObject(JSON.toJSONString(request.get("UserId")), Integer.class);
        SysUserDto sysUserDto = sysUserService.selectByPrimaryKey(userId);
        int result = brdBrandService.delete(brdBrandDto.getBrdId());
        if(result == 0){
            responseDto.setSuccess(false);
        }else{
            responseDto.setSuccess(true);
        }
        return responseDto;
    }
}
