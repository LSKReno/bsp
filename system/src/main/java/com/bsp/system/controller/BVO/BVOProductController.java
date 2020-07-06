package com.bsp.system.controller.BVO;

import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.ProProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/bvo/product")
public class BVOProductController {

    @Resource
    private ProProductService proProductService;

    /**
     * 列表查询pro状态为A的商品
     */
    @PostMapping("/listA")
    public ResponseDto listA(PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        proProductService.listA(pageDto);
        if(pageDto.getTotal()==0){
            responseDto.setSuccess(false);
        }else{
            responseDto.setCode("200");
        }
        responseDto.setContent(pageDto);
        return responseDto;
    }

}
