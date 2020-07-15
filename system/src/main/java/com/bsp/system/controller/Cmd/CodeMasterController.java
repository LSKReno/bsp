package com.bsp.system.controller.Cmd;

import com.bsp.server.dto.CdmCodeMasterDto;
import com.bsp.server.dto.ParParameterDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.service.CdmCodeMasterService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/CodeMasterController")
public class CodeMasterController {
    @Resource
    private CdmCodeMasterService cdmCodeMasterService;
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
    public ResponseDto saveCdm(@RequestBody CdmCodeMasterDto cdmCodeMasterDto){
        ResponseDto responseDto = new ResponseDto();
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
