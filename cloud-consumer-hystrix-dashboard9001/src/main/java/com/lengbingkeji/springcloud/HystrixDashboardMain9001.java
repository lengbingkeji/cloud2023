package com.lengbingkeji.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * ClassName: HystrixDashboardMain9001
 * Package: com.lengbingkeji.springcloud
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/22 19:19
 * @Version 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class,args);
    }
}
