package com.lyy.order.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author lyy
 * @Create 2019/8/18
 */
@Data
public class OrderInfo {
    public Long id;

    /**
     * 下单时间
     */
    private Date orderCreate;

    /**
     * 订单金额
     */
    public BigDecimal orderAmount;

    /**
    * 买家名称
    */
    private String buyName;


    /**
    * 卖家名称
    */
    private String sellName;



}
