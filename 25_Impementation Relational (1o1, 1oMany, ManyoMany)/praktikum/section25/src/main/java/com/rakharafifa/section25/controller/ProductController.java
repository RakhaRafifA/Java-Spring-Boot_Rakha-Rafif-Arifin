package com.rakharafifa.section25.controller;

import java.util.List;

import com.rakharafifa.section25.entity.Product;
import com.rakharafifa.section25.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rakhara")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/product")
    List<Product> getAllProduct(){
        return productRepository.findAll();
    }
}
