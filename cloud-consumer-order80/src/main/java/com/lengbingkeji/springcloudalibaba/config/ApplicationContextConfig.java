package com.lengbingkeji.springcloudalibaba.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: ApplicationContextConfig
 * Package: com.lengbingkeji.springcloud.config
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/17 21:42
 * @Version 1.0
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    //@LoadBalanced   //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
