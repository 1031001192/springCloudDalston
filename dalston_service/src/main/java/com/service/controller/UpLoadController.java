package com.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description: upload file
 * @Title: UpLoadController
 * @Package com.service.controller
 * @Author: LiBing
 * @Copyright 版权归个人所有
 * @CreateTime: 2022/4/29 16:21
 */
@Slf4j
@RestController
public class UpLoadController {
    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String handleFileUpload(@RequestPart(value = "file") MultipartFile file) {
        log.info("上传文件 service 被调用 :fileName:" + file.getName());
        return file.getName();

    }
}
