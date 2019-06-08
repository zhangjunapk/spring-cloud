package org.zj.invokefeign.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: ZhangJun
 * @Date: 2019/6/8 12:26
 * @Description:
 */

@FeignClient(name = "SERVICE-HELLOWORLD",fallback = HelloWorldServiceFailure.class)
public interface HelloWorldService {
    @HystrixCommand//加了这个注解，每次访问这个方法就能让熔断器检测获得请求信息
    @RequestMapping(value = "/",method = RequestMethod.GET)
    String sayHello();

}

