package org.zj.invokeribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.zj.invokeribbonclient.service.HelloService;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaServer
public class InvokeribbonclientApplication {

    @Autowired
    static HelloService service;

    public static void main(String[] args) {
        SpringApplication.run(InvokeribbonclientApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        System.out.println("template init---------");
        return new RestTemplate();
    }

}
