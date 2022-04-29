package com.consumer.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: reignclients
 * @Title: DcClient
 * @Package com.consumer.client
 * @Author: LiBing
 * @Copyright 版权归个人所有
 * @CreateTime: 2022/4/29 14:29
 */
@FeignClient("service")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}
