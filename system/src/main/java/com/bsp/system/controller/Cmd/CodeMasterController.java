package com.bsp.system.controller.Cmd;

import com.alibaba.fastjson.JSON;
import com.bsp.server.dto.CdmCodeMasterDto;
import com.bsp.server.dto.ParParameterDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.service.CdmCodeMasterService;
import com.bsp.server.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/CodeMasterController")
public class CodeMasterController {
    @Resource
    private CdmCodeMasterService cdmCodeMasterService;
    @Resource
    private SysUserService sysUserService;
    @PostMapping("/getCdmList")
    public ResponseDto getCdmList(@RequestBody SysUserDto sysUserDto){
        ResponseDto responseDto = new ResponseDto();
        if(sysUserDto.getRights().equals("1")){
            List<CdmCodeMasterDto> cdmCodeMasterDtos = cdmCodeMasterService.selectAll();
            responseDto.setSuccess(true);
            responseDto.setContent(cdmCodeMasterDtos);
        }else{
            responseDto.setSuccess(false);
        }
        return responseDto;
    }
    @PostMapping("/saveCdm")
    public ResponseDto saveCdm(@RequestBody Map<String, Object> request){
        ResponseDto responseDto = new ResponseDto();
        SysUserDto sysUserDto = JSON.parseObject(JSON.toJSONString(request.get("SysUserDto")), SysUserDto.class);
        SysUserDto sysUserDto1 = sysUserService.selectByPrimaryKey(sysUserDto.getUserId());
        CdmCodeMasterDto cdmCodeMasterDto = JSON.parseObject(JSON.toJSONString(request.get("CdmCodeMasterDto")), CdmCodeMasterDto.class);
        System.out.println(cdmCodeMasterDto.toString());
        cdmCodeMasterDto.setLastUpdateBy(sysUserDto1.getUsername());
        if(cdmCodeMasterDto.getCdmId() == null){
            cdmCodeMasterDto.setCreatedBy(sysUserDto1.getUsername());
        }
        cdmCodeMasterDto.setCallCnt(0);
        cdmCodeMasterDto.setDeleted(0);
        cdmCodeMasterDto.setSeqNo(null);
        cdmCodeMasterDto.setStsCd("0");
        int result = cdmCodeMasterService.save(cdmCodeMasterDto);
        if(result >0){
            responseDto.setSuccess(true);
        }else{
            responseDto.setSuccess(false);
        }
        return responseDto;
    }
    @PostMapping("/removeCdm")
    public ResponseDto removeCdm(@RequestBody CdmCodeMasterDto cdmCodeMasterDto){
        ResponseDto responseDto = new ResponseDto();
        int result = cdmCodeMasterService.delete(cdmCodeMasterDto.getCdmId());
        if(result >0){
            responseDto.setSuccess(true);
        }else{
            responseDto.setSuccess(false);
        }
        return responseDto;
    }
}
