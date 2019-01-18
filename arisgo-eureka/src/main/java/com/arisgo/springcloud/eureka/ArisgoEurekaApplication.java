package com.arisgo.springcloud.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ArisgoEurekaApplication {

    private static Logger logger = LoggerFactory.getLogger(ArisgoEurekaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ArisgoEurekaApplication.class, args);
        logger.info("......... {} .........", "SpringCloud start success!");
    }

}

