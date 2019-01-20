package com.arisgo.springcloud.service.sky.controller;

import com.arisgo.springcloud.service.model.Result;
import com.arisgo.springcloud.service.sky.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-20 10:48
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/getUser", produces = "application/json")
    public Result getUser() {
        return userService.getUser();
    }
}