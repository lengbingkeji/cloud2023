package com.lengbingkeji.springcloud.controller;

import com.lengbingkeji.springcloud.entities.CommonResult;
import com.lengbingkeji.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: OrderController
 * Package: com.lengbingkeji.springcloud.controller
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/17 21:30
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderController {
    //public static final String PaymentSrv_URL = "http://localhost:8001";  //单机版
    // 通过在eureka上注册过的微服务名称调用
    public static final String PAYMENT_SRV = "http://CLOUD-PAYMENT-SERVICE";    //集群版
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")//客户端用浏览器是get请求，但是底层实质发送post调用服务8001
    public CommonResult<Payment> create(Payment payment){
        //return restTemplate.postForObject(PaymentSrv_URL + "/payment/create",payment,CommonResult.class);
        return restTemplate.postForObject(PAYMENT_SRV + "/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable Long id){
        //return restTemplate.getForObject(PaymentSrv_URL + "/payment/get/"+id, CommonResult.class);
        return restTemplate.getForObject(PAYMENT_SRV + "/payment/get/"+id, CommonResult.class);
    }

}
