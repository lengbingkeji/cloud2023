package com.lengbingkeji.springcloud;

import java.time.ZonedDateTime;

/**
 * ClassName: ZonedDateTimeDemo
 * Package: com.lengbingkeji.springcloud
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/23 15:06
 * @Version 1.0
 */
public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now();    // 默认时区
        System.out.println(zbj);
        // ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York")); // 用指定时区获取当前时间
        // System.out.println(zny);
    }
}
