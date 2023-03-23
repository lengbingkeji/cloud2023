package com.lengbingkeji.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: OrderHystrixMain80
 * Package: com.lengbingkeji.springcloud
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/22 12:06
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}
