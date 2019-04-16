package com.hxzy.myspringbootdemo;

import com.hxzy.myspringbootdemo.entity.Persion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyspringbootdemoApplicationTests {
    @Autowired
    Persion persion;
    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void applicationContextdemo() {
        boolean userService = applicationContext.containsBean("userService");
        System.out.println(userService);
    }

    @Test
    public void contextLoads() {
        System.out.println(persion);
    }

}
