package com.lengbingkeji.springcloudalibaba.domain;

import lombok.Data;

/**
 * ClassName: Storage
 * Package: com.lengbingkeji.springcloudalibaba.domain
 * Description:
 *
 * @Author lengbing
 * @Create 2023/3/27 17:18
 * @Version 1.0
 */
@Data
public class Storage {
    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
