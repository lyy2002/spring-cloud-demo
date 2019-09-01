package com.lyy.order.controller;

import com.lyy.order.entity.OrderInfo;
import com.lyy.order.entity.OrderItem;
import com.lyy.order.vo.OrderVo;
import com.lyy.product.client.ProductClient;
import com.lyy.product.common.response.ProductInfoResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;

@RequestMapping("/v1")
@RestController
public class OrderController {

    @Autowired
    private ProductClient productClient;

    @RequestMapping("/findOrderById")

//    @HystrixCommand(groupKey = "productService",commandKey = "findProductById",fallbackMethod = "defaultStores")
    public OrderVo findOrderById(){
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setBuyName("张三");
        orderInfo.setId(1L);
        orderInfo.setOrderAmount(new BigDecimal(20));
        orderInfo.setSellName("李四");

        OrderVo orderVo = new OrderVo();
        BeanUtils.copyProperties(orderInfo, orderVo);

        //查询商品名称
        ProductInfoResponse product = productClient.findProductById(1L);

        OrderItem orderItem = new OrderItem();
        orderItem.setId(1L);
        orderItem.setNum(2);
        orderItem.setGoodsName(product.getName());

        orderVo.setOrderItems(Arrays.asList(orderItem));

        return orderVo;
    }

    /**
     * 这的返回值类型要和上面的一致，并且引用方要在启动的main类上配置扫描范围
     * @return
     */
    private OrderVo defaultStores() {
        System.out.println("fall test");
        return   new OrderVo();
    }

}
