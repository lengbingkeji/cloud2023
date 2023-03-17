package com.lengbingkeji.springcloud.service;

import com.lengbingkeji.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: PaymentService
 * Package: com.lengbingkeji.springcloud.service
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/17 14:59
 * @Version 1.0
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
