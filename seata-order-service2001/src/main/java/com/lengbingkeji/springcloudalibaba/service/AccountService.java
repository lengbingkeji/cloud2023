package com.lengbingkeji.springcloudalibaba.service;

import com.lengbingkeji.springcloudalibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * ClassName: AccountService
 * Package: com.lengbingkeji.springcloudalibaba.service
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/27 15:57
 * @Version 1.0
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
