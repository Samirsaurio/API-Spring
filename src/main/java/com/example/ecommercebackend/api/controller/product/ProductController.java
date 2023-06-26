package com.example.ecommercebackend.api.controller.product;

import com.example.ecommercebackend.model.Product;
import com.example.ecommercebackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/minusisx")
    public List<Product> getProductsMinusSix(){
        return productService.getProductsMinusSix();
    }

    @GetMapping("/minus/{price}")
    public List<Product> getProductsMinus(@PathVariable("price") Integer price){
        return productService.getProductMinus(price);
    }

    @GetMapping("/minusid/{price}/{id}")
    public List<Product> getProductsMinus(@PathVariable Integer price, @PathVariable Integer id){
        return productService.getProductMinusId(price, id);
    }
}
