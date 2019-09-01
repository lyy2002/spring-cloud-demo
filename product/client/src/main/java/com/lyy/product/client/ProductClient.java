package com.lyy.product.client;

import com.lyy.product.common.response.ProductInfoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author lyy
 * @Create 2019/8/18
 */
@FeignClient(name = "product",fallback = ProductClient.ProductFallback.class)
public interface ProductClient {

    @GetMapping("/v1/findById")
    ProductInfoResponse findProductById(@RequestParam("id") Long id);

    @Component
    /**
     * 这个一定要加上@Component ，否则引用方扫描不到,引用方的启动类上也要设置下@ComponentScan(basePackages = "com.lyy")
     */
     static class ProductFallback implements ProductClient {

        @Override
        public ProductInfoResponse findProductById(Long id) {
            System.out.println("降级处理");
            return new ProductInfoResponse();
        }
    }
}
