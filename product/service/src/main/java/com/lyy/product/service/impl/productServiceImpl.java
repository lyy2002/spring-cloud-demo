package com.lyy.product.service.impl;

import com.lyy.product.entity.ProductInfo;
import com.lyy.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class productServiceImpl implements ProductService {
    @Override
    public ProductInfo findProductInfoById(Long id) {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setId(1L);
        productInfo.setName("包子");
        productInfo.setPrice(new BigDecimal(1));
        return productInfo;
    }
}
