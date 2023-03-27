package com.lengbingkeji.springcloudalibaba.service;

import com.lengbingkeji.springcloudalibaba.entities.CommonResult;
import com.lengbingkeji.springcloudalibaba.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * ClassName: PaymentFallbackService
 * Package: com.lengbingkeji.springcloudalibaba.service
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/27 10:30
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
