package com.arisgo.springcloud.zuul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ArisgoZuulApplication {

    private static Logger logger = LoggerFactory.getLogger(ArisgoZuulApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ArisgoZuulApplication.class, args);
        logger.info("......... {} .........", "SpringCloud Zuul start success!");
    }

}

