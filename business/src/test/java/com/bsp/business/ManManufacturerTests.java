package com.bsp.business;

import com.bsp.business.config.BusinessApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by LSK.Reno on 2020/7/3 11:07.
 */
@SpringBootTest
@ContextConfiguration(classes = BusinessApplication.class)
public class ManManufacturerTests {

    @Test
    void test_xxx() {
        System.out.println("我在执行：test_xxx");
    }


}
