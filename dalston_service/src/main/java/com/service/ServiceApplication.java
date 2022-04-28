package com.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * @Description: ServiceApplication
 * @Title: com.service.ServiceApplication
 * @Package com.service
 * @Author: LiBing
 * @Copyright 版权归个人所有
 * @CreateTime: 2022/4/28 16:48
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ServiceApplication.class).web(true).run(args);
	}

}
