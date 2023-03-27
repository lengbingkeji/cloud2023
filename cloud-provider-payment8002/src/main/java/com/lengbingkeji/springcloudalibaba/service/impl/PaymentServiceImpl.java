package com.lengbingkeji.springcloudalibaba.service.impl;

import com.lengbingkeji.springcloudalibaba.dao.PaymentDao;
import com.lengbingkeji.springcloudalibaba.entities.Payment;
import com.lengbingkeji.springcloudalibaba.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName: PaymentServiceImpl
 * Package: com.lengbingkeji.springcloud.service.impl
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/17 15:01
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
