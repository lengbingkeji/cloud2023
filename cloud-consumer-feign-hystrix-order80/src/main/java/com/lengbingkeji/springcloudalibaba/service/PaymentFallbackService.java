package com.lengbingkeji.springcloudalibaba.service;

import org.springframework.stereotype.Component;

/**
 * ClassName: PaymentFallbackService
 * Package: com.lengbingkeji.springcloud.service
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/22 17:35
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_OK,o(ㄒ__ㄒ)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_TimeOut,o(ㄒ__ㄒ)o";
    }
}
