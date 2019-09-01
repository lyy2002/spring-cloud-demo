package com.lyy.product.common.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductInfoResponse {
    private Long id;

    private String name;

    private BigDecimal price;
}
