package com.service.controller;

import com.service.annotation.LogAspect;
import com.service.annotation.LoginRequired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 注解测试类
 * @Title: AnnotationTestController
 * @Package com.service.controller
 * @Author: LiBing
 * @Copyright 版权归个人所有
 * @CreateTime: 2022/5/5 9:33
 */
@RestController
public class AnnotationTestController {

    @LoginRequired
    @GetMapping("/sourceA")
    public String sourceA(){
        return "你正在访问sourceA资源";
    }

    @GetMapping("/sourceB")
    public String sourceB(){
        return "你正在访问sourceB资源";
    }

    @LogAspect
    @GetMapping("/sourceC/{source_name}")
    public String sourceC(@PathVariable("source_name") String sourceName){
        return "你正在访问sourceC资源";
    }
}
