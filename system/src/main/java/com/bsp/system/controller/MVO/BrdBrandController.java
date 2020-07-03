package com.bsp.system.controller.MVO;

import com.bsp.server.domain.BrdBrand;
import com.bsp.server.dto.BrdBrandDto;
import com.bsp.server.dto.ManManufacturerDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.BrdBrandService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/BrdBrandController")
public class BrdBrandController {
    @Resource
    private BrdBrandService brdBrandService;
    @RequestMapping("/getBrandsList")
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
    @RequestMapping("/saveBrand")
    public ResponseDto saveBrand(@RequestBody BrdBrandDto brdBrandDto){
        ResponseDto responseDto = new ResponseDto();
        int result = brdBrandService.save(brdBrandDto);
        if(result == 0){
            responseDto.setSuccess(false);
        }else{
            responseDto.setSuccess(true);
        }
        return responseDto;
    }
    @RequestMapping("/removeBrand")
    public ResponseDto removeBrand(@RequestBody BrdBrandDto brdBrandDto){
        ResponseDto responseDto = new ResponseDto();
        int result = brdBrandService.delete(brdBrandDto.getBrdId());
        if(result == 0){
            responseDto.setSuccess(false);
        }else{
            responseDto.setSuccess(true);
        }
        return responseDto;
    }
}
