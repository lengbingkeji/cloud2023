package com.lengbingkeji.springcloudalibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: StorageDao
 * Package: com.lengbingkeji.springcloudalibaba.dao
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/27 17:20
 * @Version 1.0
 */
@Mapper
public interface StorageDao {
    //扣减库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
