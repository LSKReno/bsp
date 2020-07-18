package com.bsp.server.service;


import com.bsp.server.util.RedisUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;
import java.text.DecimalFormat;

@Service
public class TrackingNumberService {
    @Resource
    private RedisUtil redisUtil;

    public String getId(String busiDate) {
        long incr = redisUtil.incr(busiDate, 1);
        if(incr == 1){
            redisUtil.expire(busiDate, 24*60*60);
        }
        return createId(busiDate, incr);
    }
    private String createId(String busiDate, long incr) {
        DecimalFormat df = new DecimalFormat("0000000");
        String format = df.format(incr);
        return busiDate + format;
    }
}
