package com.arisgo.springcloud.service.sky.controller;

import com.arisgo.springcloud.service.utils.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @author Silencer
 * @date 2019-01-19 21:21
 */
@RestController
@RequestMapping("/sky")
@RefreshScope
public class SkyController {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    @RequestMapping("/hello")
    public Result skyHello() {
        String msg = "Hello " + applicationName + "; Your port is " + port;
        return Result.success(msg);
    }
}
