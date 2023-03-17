package com.lengbingkeji.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: CommonResult
 * Package: com.lengbingkeji.springcloud.entities
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/17 21:24
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String  message;
    private T data;

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
