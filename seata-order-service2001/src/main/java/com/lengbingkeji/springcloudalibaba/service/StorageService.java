package com.lengbingkeji.springcloudalibaba.service;

import com.lengbingkeji.springcloudalibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName: StorageService
 * Package: com.lengbingkeji.springcloudalibaba.service
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/27 15:50
 * @Version 1.0
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
