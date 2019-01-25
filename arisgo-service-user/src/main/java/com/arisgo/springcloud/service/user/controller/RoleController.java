package com.arisgo.springcloud.service.user.controller;

import com.arisgo.springcloud.service.user.service.RoleService;
import com.arisgo.springcloud.service.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-21 14:24
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Resource
    private RoleService roleServiceImpl;

    @GetMapping(value = "/getRole", produces = "application/json")
    public Result getUser() {
        return roleServiceImpl.getRole();
    }
}
