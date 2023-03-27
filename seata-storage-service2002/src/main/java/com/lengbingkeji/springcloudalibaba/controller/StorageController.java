package com.lengbingkeji.springcloudalibaba.controller;

import com.lengbingkeji.springcloudalibaba.domain.CommonResult;
import com.lengbingkeji.springcloudalibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: StorageController
 * Package: com.lengbingkeji.springcloudalibaba.controller
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/27 17:40
 * @Version 1.0
 */
@RestController
public class StorageController {
    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
