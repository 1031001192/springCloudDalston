package com.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description: configservice
 * @Title: ConfigApplication
 * @Package com.config
 * @Author: LiBing
 * @Copyright 版权归个人所有
 * @CreateTime: 2022/4/30 11:25
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigApplication.class).web(true).run(args);
    }
}
