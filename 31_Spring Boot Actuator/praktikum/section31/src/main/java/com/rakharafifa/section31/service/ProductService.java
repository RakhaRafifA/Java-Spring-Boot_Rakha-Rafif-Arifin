package com.rakharafifa.section31.service;

import java.util.List;

import com.rakharafifa.section31.entity.Product;

public interface ProductService {
    List<Product> getAllProduct();
    Product getProductById(Long id);
    Product createProduct(Product product);
    void updateProduct(Long id, Product product);
    void deleteProduct(Long id);
    
}
