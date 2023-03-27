package com.lengbingkeji.springcloudalibaba.service.impl;

import com.lengbingkeji.springcloudalibaba.dao.StorageDao;
import com.lengbingkeji.springcloudalibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * ClassName: StorageServiceImpl
 * Package: com.lengbingkeji.springcloudalibaba.service.impl
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/27 17:31
 * @Version 1.0
 */
@Service
public class StorageServiceImpl implements StorageService {
    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        LOGGER.info("------->storage-service中扣减库存结束");
    }
}
