package com.consumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Description: consumer
 * @Title: consumerApplication
 * @Package com.consumer
 * @Author: LiBing
 * @Copyright 版权归个人所有
 * @CreateTime: 2022/4/29 12:05
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumerApplication.class).web(true).run(args);
    }
}
