package com.arisgo.springcloud.service.user.facade;

import com.arisgo.springcloud.service.utils.Result;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-21 14:16
 */
//@FeignClient("arisgo-service-sky")
public interface DemoFacade {

    //    @GetMapping(value = "/demo/hello")
    Result hello();
}
