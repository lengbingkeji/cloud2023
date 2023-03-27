package com.lengbingkeji.springcloudalibaba.service;

/**
 * ClassName: StorageService
 * Package: com.lengbingkeji.springcloudalibaba.service
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/27 17:29
 * @Version 1.0
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
