package com.lengbingkeji.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: Payment
 * Package: com.lengbingkeji.springcloud.entities
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/17 21:25
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
