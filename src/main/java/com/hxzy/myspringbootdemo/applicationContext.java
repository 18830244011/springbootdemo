package com.hxzy.myspringbootdemo;

import com.hxzy.myspringbootdemo.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class applicationContext {

    @Bean
    public UserService userService() {
        return new UserService();
    }

}
