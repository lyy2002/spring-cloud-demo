package com.lyy.order.entity;

import lombok.Data;

/**
 * @Author lyy
 * @Create 2019/8/18
 */
@Data
public class OrderItem {

    /**
    * id
    */
    private Long id;


    /**
    * 商品名称
    */
    private String goodsName;


    /**
    * 数量
    */
    private int num;


}
