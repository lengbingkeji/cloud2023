package com.lengbingkeji.springcloudalibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * ClassName: OrderNacosController
 * Package: com.lengbingkeji.springcloudalibaba.controller
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/25 18:46
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderNacosController {
    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") long id){
        return restTemplate.getForObject(serverURL + "/payment/nacos/"+id,String.class);
    }
}
