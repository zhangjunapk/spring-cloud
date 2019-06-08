package org.zj.invokeribbonclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zj.invokeribbonclient.service.HelloService;

/**
 * @Auther: ZhangJun
 * @Date: 2019/6/7 11:14
 * @Description:
 */
@RestController
public class RibbonTestController {

    @Autowired
    HelloService service;

    @RequestMapping("/")
    public String  fffffffffffffffffff(){
        return service.getContent();
    }
}
