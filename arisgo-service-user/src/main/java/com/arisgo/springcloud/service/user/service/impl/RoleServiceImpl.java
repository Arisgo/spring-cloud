package com.arisgo.springcloud.service.user.service.impl;

import com.arisgo.springcloud.service.user.facade.user.UserFacade;
import com.arisgo.springcloud.service.user.mapper.RoleMapper;
import com.arisgo.springcloud.service.user.model.Role;
import com.arisgo.springcloud.service.user.service.RoleService;
import com.arisgo.springcloud.service.base.BaseService;
import com.arisgo.springcloud.service.utils.Result;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-21 14:51
 */
@Service
public class RoleServiceImpl extends BaseService implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private UserFacade userFacade;

    @Override
    @HystrixCommand(fallbackMethod = "exception")
    public Result getRole() {
        List<Role> list = roleMapper.getRole();
        Object data = userFacade.getUser().getData();
        Map<String, Object> map = new HashMap<>(4);
        map.put("role", list);
        map.put("data", data);
        return Result.success(map);
    }
}
