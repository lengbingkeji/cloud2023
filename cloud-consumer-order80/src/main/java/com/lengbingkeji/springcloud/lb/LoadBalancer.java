package com.lengbingkeji.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * ClassName: LoadBalancer
 * Package: com.lengbingkeji.springcloud.lb
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/21 15:04
 * @Version 1.0
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
