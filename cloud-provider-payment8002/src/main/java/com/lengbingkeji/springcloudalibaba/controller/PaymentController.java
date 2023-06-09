package com.lengbingkeji.springcloudalibaba.controller;

import com.lengbingkeji.springcloudalibaba.entities.CommonResult;
import com.lengbingkeji.springcloudalibaba.entities.Payment;
import com.lengbingkeji.springcloudalibaba.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName: PaymentController
 * Package: com.lengbingkeji.springcloud.controller
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/17 15:11
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        //public CommonResult create(Payment payment) { //Postman测试是使用该方法
        int result = paymentService.create(payment);
        log.info("*****插入操作返回结果:" + result);

        if(result > 0) {
            //return new CommonResult(200,"插入数据库成功",result);
            return new CommonResult(200,"插入数据库成功,返回结果"+ result + "\t 服务端口：" + serverPort,payment);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果:{}",payment);
        //int age = 10/2;
        if (payment != null) {
            //return new CommonResult(200,"查询成功",payment);
            return new CommonResult(200,"查询成功" + "\t 服务端口：" + serverPort, payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            System.out.println(element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance element : instances) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t" + element.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }

}
