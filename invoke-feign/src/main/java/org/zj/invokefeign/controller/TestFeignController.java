package org.zj.invokefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zj.invokefeign.service.HelloWorldService;

/**
 * @Auther: ZhangJun
 * @Date: 2019/6/8 12:28
 * @Description:
 */
@RestController
public class TestFeignController {

    @Autowired
    HelloWorldService service;

    @GetMapping("/")
    public String sss(){
        return service.sayHello();
    }

    @GetMapping("/hello")
    public String sssssss(){
        return service.sayHello();
    }

}
