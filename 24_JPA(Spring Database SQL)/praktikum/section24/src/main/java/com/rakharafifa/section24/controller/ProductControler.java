package com.rakharafifa.section24.controller;

import com.rakharafifa.section24.model.Product;
import com.rakharafifa.section24.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rakha")
public class ProductControler {
    @Autowired
    private ProductService productService;

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return productService.getProduct(id);
    }

    @PostMapping("/product")
    public Product postProduct(@RequestBody Product barang){
        return productService.postProduct(barang);
    }

    @PutMapping("/product/{id}")
    public Product putProductById(@RequestBody Product barang){
        return productService.putProduct(barang);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProductById(@PathVariable("id") Long id){
       productService.deleteProduct(id);
    }
}
