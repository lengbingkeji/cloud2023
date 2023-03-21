package com.lengbingkeji.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: MySelfRule
 * Package: com.lengbingkeji.myrule
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/21 14:39
 * @Version 1.0
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();    //定义为随机
    }
}
