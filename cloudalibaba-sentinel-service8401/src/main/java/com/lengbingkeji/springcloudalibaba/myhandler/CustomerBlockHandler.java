package com.lengbingkeji.springcloudalibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lengbingkeji.springcloudalibaba.entities.CommonResult;

/**
 * ClassName: CustomerBlockHandler
 * Package: com.lengbingkeji.springcloudalibaba.myhandler
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/27 9:13
 * @Version 1.0
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
