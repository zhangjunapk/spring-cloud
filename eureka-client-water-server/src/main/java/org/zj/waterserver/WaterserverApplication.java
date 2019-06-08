package org.zj.waterserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableHystrixDashboard//启用熔断器仪表盘
@EnableTurbine//这是啥
public class WaterserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaterserverApplication.class, args);
    }

}
