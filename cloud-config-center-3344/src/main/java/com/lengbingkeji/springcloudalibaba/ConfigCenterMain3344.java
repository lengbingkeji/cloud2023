package com.lengbingkeji.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * ClassName: ConfigCenterMain3344
 * Package: com.lengbingkeji.springcloud
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/23 23:03
 * @Version 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class,args);
    }
}
