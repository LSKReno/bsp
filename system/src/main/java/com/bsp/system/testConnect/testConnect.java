package com.bsp.system.testConnect;

import com.bsp.server.domain.SysUser;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.service.TrackingNumberService;
import org.apache.commons.lang.time.FastDateFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class testConnect {
    @Resource
    TrackingNumberService trackingNumberService;
    @PostMapping("/testPost")
    public ResponseDto testPost(@RequestBody Map<String, Object> request){
        ResponseDto responseDto = new ResponseDto();
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        System.out.println(trackingNumberService.getId(format.format(new Date())));
        return new ResponseDto();
    }
}

