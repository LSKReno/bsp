package com.bsp.system;

import com.bsp.system.config.SystemApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by LSK.Reno on 2020/7/3 11:46.
 */

@SpringBootTest
@ContextConfiguration(classes = SystemApplication.class)
public class SystemApplicationTests {


    @Test
    void test_xxx() {
        System.out.println("我在执行：SystemApplicationTests");
    }


}
