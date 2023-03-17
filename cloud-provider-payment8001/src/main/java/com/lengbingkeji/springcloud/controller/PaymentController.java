package com.lengbingkeji.springcloud.controller;

import com.lengbingkeji.springcloud.entities.CommonResult;
import com.lengbingkeji.springcloud.entities.Payment;
import com.lengbingkeji.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        //public CommonResult create(Payment payment) { //Postman测试是使用该方法
        int result = paymentService.create(payment);
        log.info("*****插入操作返回结果:" + result);

        if(result > 0) {
            return new CommonResult(200,"插入数据库成功",result);
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
            return new CommonResult(200,"查询成功",payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
        }
    }


}
