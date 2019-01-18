package com.arisgo.springcloud.service.user.controller;

import com.arisgo.springcloud.service.model.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @auther Silencer
 * @date 2019-01-19 1:39
 */
@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController {

    @Value("${color}")
    private String color;

    @RequestMapping("/hello")
    public Result hello() {
        return Result.success("Hello Spring Cloud!" + "..." + color);
    }
}
