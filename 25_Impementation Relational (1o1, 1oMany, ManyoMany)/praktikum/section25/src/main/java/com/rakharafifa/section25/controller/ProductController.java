package com.rakharafifa.section25.controller;

import java.util.List;

import com.rakharafifa.section25.entity.Product;
import com.rakharafifa.section25.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rakhara/product")
public class ProductController {
    ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> products = productService.getAllProduct();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/{product_id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long product_id){
        return new ResponseEntity<>(productService.getProductById(product_id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        Product product2 = productService.postProduct(product);
        return new ResponseEntity<>(product2, HttpStatus.CREATED);
    }

    @PutMapping("/{product_id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("product_id") Long product_id,@RequestBody Product product){
        productService.updateProduct(product_id, product);
        return new ResponseEntity<>(productService.getProductById(product_id), HttpStatus.OK);
    }

    @DeleteMapping("/{product_id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable("product_id") Long product_id) {
        productService.deleteProduct(product_id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
