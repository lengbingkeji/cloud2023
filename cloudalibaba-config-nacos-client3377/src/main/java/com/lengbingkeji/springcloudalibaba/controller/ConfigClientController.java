package com.lengbingkeji.springcloudalibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: ConfigClientController
 * Package: com.lengbingkeji.springcloudalibaba.controller
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/25 19:43
 * @Version 1.0
 */
@RestController
@RefreshScope   //在控制器类加入@RefreshScope注解使当前类下的配置支持Nacos的动态刷新功能。
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
