package com.lengbingkeji.springcloudalibaba.controller;

import com.lengbingkeji.springcloudalibaba.domain.CommonResult;
import com.lengbingkeji.springcloudalibaba.domain.Order;
import com.lengbingkeji.springcloudalibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName: OrderController
 * Package: com.lengbingkeji.springcloudalibaba.controller
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/27 16:27
 * @Version 1.0
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
