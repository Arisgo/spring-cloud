package com.arisgo.springcloud.service.user.controller;

import com.arisgo.springcloud.service.utils.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @author Silencer
 * @date 2019-01-19 1:39
 */
@RestController
@RequestMapping("/demo")
@RefreshScope
public class DemoController {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    @RequestMapping("/hello")
    public Result hello() {
        String msg = "Hello " + applicationName + "; Your port is " + port;
        return Result.success(msg);
    }
}
