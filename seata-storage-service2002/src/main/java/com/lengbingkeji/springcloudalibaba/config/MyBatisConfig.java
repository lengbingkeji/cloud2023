package com.lengbingkeji.springcloudalibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: MyBatisConfig
 * Package: com.lengbingkeji.springcloudalibaba.config
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/27 17:43
 * @Version 1.0
 */
@Configuration
@MapperScan({"com.lengbingkeji.springcloudalibaba.dao"})
public class MyBatisConfig {
}
