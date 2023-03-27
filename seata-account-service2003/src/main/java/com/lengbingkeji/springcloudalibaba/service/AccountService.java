package com.lengbingkeji.springcloudalibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * ClassName: AccountService
 * Package: com.lengbingkeji.springcloudalibaba.service
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/27 18:35
 * @Version 1.0
 */
public interface AccountService {
    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
