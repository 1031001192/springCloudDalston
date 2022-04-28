package com.lb;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: Application
 * @Title: com.lb.EurekaApplication
 * @Package com.lb
 * @Author: LiBing
 * @Copyright 版权归个人所有
 * @CreateTime: 2022/4/28 16:48
 */
@EnableEurekaServer
@SpringCloudApplication
public class EurekaApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(EurekaApplication.class).web(true).run(args);

    }

}
