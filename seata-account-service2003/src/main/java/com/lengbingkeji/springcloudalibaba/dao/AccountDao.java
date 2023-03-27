package com.lengbingkeji.springcloudalibaba.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * ClassName: AccountDao
 * Package: com.lengbingkeji.springcloudalibaba.dao
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/27 18:22
 * @Version 1.0
 */
@MapperScan
public interface AccountDao {
    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
