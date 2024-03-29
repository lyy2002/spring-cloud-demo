package com.lyy.product.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductInfo {

    private Long id;

    private String name;

    private BigDecimal price;

}
