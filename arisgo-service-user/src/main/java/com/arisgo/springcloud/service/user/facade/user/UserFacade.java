package com.arisgo.springcloud.service.user.facade.user;

import com.arisgo.springcloud.service.utils.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-21 14:22
 */
@FeignClient("arisgo-service-sky")
public interface UserFacade {

    @GetMapping("/user/getUser")
    Result getUser();
}
