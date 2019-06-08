package org.zj.eurekaserverusernamage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class EurekaServerUsernamageApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerUsernamageApplication.class, args);
    }
    @Value("${server.port}")
    String port;
    @GetMapping("/")
    public String home(){
        return "我在这里"+port;
    }
}
