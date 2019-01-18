package com.arisgo.springcloud.service.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ArisgoServiceUserApplication {

    private static Logger logger = LoggerFactory.getLogger(ArisgoServiceUserApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ArisgoServiceUserApplication.class, args);
        logger.info("......... {} .........", "SpringCloud service user start success!");
    }

}

