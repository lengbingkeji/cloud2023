package com.lengbingkeji.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName: OrderMain80
 * Package: com.lengbingkeji.springcloud
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/17 18:49
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
