package com.lyy.order.vo;

import com.lyy.order.entity.OrderItem;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderVo {
    
    public  Long id;

    /**
    * 下单时间
    */
    private Date orderCreate;

    /**
     * 订单金额
     */
    public BigDecimal orderAmount;


    public List<OrderItem> orderItems;


    
}
