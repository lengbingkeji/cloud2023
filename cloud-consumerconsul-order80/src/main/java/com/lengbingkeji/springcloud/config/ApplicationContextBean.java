package com.lengbingkeji.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: ApplicationContextBean
 * Package: com.lengbingkeji.springcloud.config
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/21 10:20
 * @Version 1.0
 */
@Configuration
public class ApplicationContextBean {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
