package com.arisgo.springcloud.service.user.mapper;

import com.arisgo.springcloud.service.user.model.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-21 14:40
 */
@Mapper
public interface RoleMapper {

    List<Role> getRole();
}
