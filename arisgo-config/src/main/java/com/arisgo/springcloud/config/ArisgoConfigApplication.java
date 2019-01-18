package com.arisgo.springcloud.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ArisgoConfigApplication {

    private static Logger logger = LoggerFactory.getLogger(ArisgoConfigApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ArisgoConfigApplication.class, args);
        logger.info("......... {} .........", "SpringCloud config start success!");
    }

}

