package com.lengbingkeji.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName: GateWayMain9527
 * Package: com.lengbingkeji.springcloud
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/23 9:41
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain9527.class,args);
    }
}
