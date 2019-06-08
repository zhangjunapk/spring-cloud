package org.zj.invokefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient//启用服务发现，将这个服务注册到eureka-server
@EnableFeignClients//启用feign,启动会生成代理类，进行远程http调用
@EnableCircuitBreaker//启用熔断服务
@EnableHystrixDashboard//启用熔断器仪表盘
public class InvokefeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvokefeignApplication.class, args);
    }

}
