package com.lengbingkeji.springcloudalibaba.dao;

import com.lengbingkeji.springcloudalibaba.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: PaymentDao
 * Package: com.lengbingkeji.springcloud.dao
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/17 14:24
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
