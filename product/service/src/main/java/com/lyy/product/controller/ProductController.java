package com.lyy.product.controller;

import com.lyy.product.common.response.ProductInfoResponse;
import com.lyy.product.entity.ProductInfo;
import com.lyy.product.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/findById")
    public ProductInfoResponse findProductById(@RequestParam Long id){

/*       try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        ProductInfo info = productService.findProductInfoById(id);
        ProductInfoResponse infoResponse = new ProductInfoResponse();
        BeanUtils.copyProperties(info,infoResponse);
        return infoResponse;
    }
}
