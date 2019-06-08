package org.zj.invokeribbonclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: ZhangJun
 * @Date: 2019/6/7 10:46
 * @Description:
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;


    public String getContent(){
        return restTemplate.getForObject("http://SERVICE-HELLOWORLD/",String.class);
    }
}
