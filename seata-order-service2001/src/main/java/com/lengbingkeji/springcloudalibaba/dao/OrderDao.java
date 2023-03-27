package com.lengbingkeji.springcloudalibaba.dao;

import com.lengbingkeji.springcloudalibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: OrderDao
 * Package: com.lengbingkeji.springcloudalibaba.dao
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/27 15:28
 * @Version 1.0
 */
@Mapper
public interface OrderDao {
    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
