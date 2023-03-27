package com.lengbingkeji.springcloudalibaba.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * ClassName: ReceiveMessageListener
 * Package: com.lengbingkeji.springcloud.service
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/24 17:04
 * @Version 1.0
 */
@Component
@EnableBinding
public class ReceiveMessageListener {
    @Value("${server.port}")
    private String serverPort;

    public void input(Message<String> message){
        System.out.println("消费者1号，------->接收到的消息：" + message.getPayload()+"\t port: "+serverPort);
    }
}
