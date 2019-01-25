package com.arisgo.springcloud.service.sky.controller;

import com.arisgo.springcloud.service.sky.model.User;
import com.arisgo.springcloud.service.utils.Result;
import com.arisgo.springcloud.service.sky.service.UserService;
import org.springframework.web.bind.annotation.*;

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
    private UserService userServiceImpl;

    @GetMapping(value = "/getUser", produces = "application/json")
    public Result getUser() {
        return userServiceImpl.getUser();
    }

    @GetMapping("/redis")
    public Result cacheRedis(@RequestParam(value = "id") String id) {
        return userServiceImpl.getRedis(id);
    }

    @PostMapping(value = "/insert", produces = "application/json")
    public Result insertUser(@RequestBody User user) {
        return userServiceImpl.insert(user);
    }
}
