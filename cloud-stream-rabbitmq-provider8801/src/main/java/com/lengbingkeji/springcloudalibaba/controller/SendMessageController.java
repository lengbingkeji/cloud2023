package com.lengbingkeji.springcloudalibaba.controller;

import com.lengbingkeji.springcloudalibaba.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName: SendMessageController
 * Package: com.lengbingkeji.springcloud.controller
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/24 16:50
 * @Version 1.0
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }
}
