package com.arisgo.springcloud.service.sky;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
//@EnableEurekaClient
//@EnableFeignClients
//@EnableCircuitBreaker
public class ArisgoServiceSkyApplication {

    private static Logger logger = LoggerFactory.getLogger(ArisgoServiceSkyApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ArisgoServiceSkyApplication.class, args);
        logger.info("......... {} .........", "SpringCloud Sky start success!");
    }

}

