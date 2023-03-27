package com.lengbingkeji.springcloudalibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: ConfigClientController
 * Package: com.lengbingkeji.springcloud.controller
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/24 15:08
 * @Version 1.0
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config.info")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
