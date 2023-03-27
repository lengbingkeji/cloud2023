package com.lengbingkeji.springcloudalibaba.controller;

import com.lengbingkeji.springcloudalibaba.entities.CommonResult;
import com.lengbingkeji.springcloudalibaba.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * ClassName: PaymentController
 * Package: com.lengbingkeji.springcloudalibaba.controller
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/27 9:58
 * @Version 1.0
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    public static HashMap<Long, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put(1L,new Payment(1L,"28a8c1e3bc2742d8848569891fb42184"));
        hashMap.put(2L,new Payment(2L,"bba8c1e3bc2742d8848569891ac32185"));
        hashMap.put(3L,new Payment(3L,"6ua8c1e3bc2742d8848569891xt92186"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id)
    {
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult(200,"from mysql,serverPort:  "+serverPort,payment);
        return result;
    }
}
