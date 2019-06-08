package org.zj.invokefeign.service;

import org.springframework.stereotype.Component;

/**
 * @Auther: ZhangJun
 * @Date: 2019/6/8 16:04
 * @Description:
 */
@Component
public class HelloWorldServiceFailure implements HelloWorldService{
    @Override
    public String sayHello() {
        return "系统出错了，这是定义好的错误返回的数据(熔断器来调用)";
    }
}
