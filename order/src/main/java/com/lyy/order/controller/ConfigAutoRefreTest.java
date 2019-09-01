package com.lyy.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lyy
 * @Create 2019/8/24
 */
@RestController
@RefreshScope
public class ConfigAutoRefreTest {

    @Value("${env}")
    private String env;

    @RequestMapping("/test/print")
    public String print(){
        return  env;
    }
}
