package com.arisgo.springcloud.service.user.controller;

import com.arisgo.springcloud.service.user.facade.user.UserFacade;
import com.arisgo.springcloud.service.user.service.RoleService;
import com.arisgo.springcloud.service.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-21 14:24
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Resource
    private UserFacade userFacade;

    @Resource
    private RoleService roleServiceImpl;

    @GetMapping(value = "/getRole", produces = "application/json")
    public Result getUser() {
        Object role = roleServiceImpl.getRole().getData();
        Object user = userFacade.getUser().getData();
        Map<String, Object> map = new HashMap<>(4);
        map.put("role", role);
        map.put("user", user);
        return Result.success(map);
    }
}
