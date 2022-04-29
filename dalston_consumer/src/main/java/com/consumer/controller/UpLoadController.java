package com.consumer.controller;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;



/**
 * @Description: uploadcontroller
 * @Title: UpLoadController
 * @Package com.consumer.controller
 * @Author: LiBing
 * @Copyright 版权归个人所有
 * @CreateTime: 2022/4/29 16:26
 */
@FeignClient(value = "service", configuration = UpLoadController.MultipartSupportConfig.class)
public interface UpLoadController {
    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String handleFileUpload(@RequestPart(value = "file") MultipartFile file);

    @Configuration
    class MultipartSupportConfig {
        @Bean
        public Encoder feignFormEncoder() {
            return new SpringFormEncoder();
        }
    }
}
