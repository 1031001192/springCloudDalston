package com.consumer.controller;

import com.consumer.client.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: consumer
 * @Title: DcController
 * @Package com.consumer.controller
 * @Author: LiBing
 * @Copyright 版权归个人所有
 * @CreateTime: 2022/4/29 14:25
 */
@RestController
public class DcController {
//    @Autowired
//    LoadBalancerClient loadBalancerClient;
//    @Autowired
//    RestTemplate restTemplate;
//
//    @GetMapping("/consumer")
//    public String dc() {
//        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
//        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";
//        System.out.println(url);
//        return restTemplate.getForObject(url, String.class);
//    }

    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        return dcClient.consumer();
    }
}
