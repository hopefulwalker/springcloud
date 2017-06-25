package com.flying.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.web.ZuulController;
import org.springframework.cloud.netflix.zuul.web.ZuulHandlerMapping;

@SpringBootApplication
@EnableSidecar
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
        ZuulController controller;
        ZuulHandlerMapping mapping;
    }
}