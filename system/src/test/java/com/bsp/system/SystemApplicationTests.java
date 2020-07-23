package com.bsp.system;

import com.bsp.server.service.TrackingNumberService;
import com.bsp.system.config.SystemApplication;
import org.apache.commons.lang.time.FastDateFormat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by LSK.Reno on 2020/7/3 11:46.
 */

@SpringBootTest
@ContextConfiguration(classes = SystemApplication.class)
public class SystemApplicationTests {

    @Resource
    TrackingNumberService trackingNumberService;
    @Test
    void test_xxx() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        System.out.println(trackingNumberService.getId(format.format(new Date())));
    }


}
