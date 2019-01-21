package com.arisgo.springcloud.service.user.service.impl;

import com.arisgo.springcloud.service.user.mapper.RoleMapper;
import com.arisgo.springcloud.service.user.model.Role;
import com.arisgo.springcloud.service.user.service.RoleService;
import com.arisgo.springcloud.service.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-21 14:51
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public Result getRole() {
        List<Role> list = roleMapper.getRole();
        return Result.success(list);
    }
}
