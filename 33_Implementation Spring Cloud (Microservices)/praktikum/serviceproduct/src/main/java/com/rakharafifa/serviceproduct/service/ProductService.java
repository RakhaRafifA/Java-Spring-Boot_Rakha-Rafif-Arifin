package com.rakharafifa.serviceproduct.service;

import java.util.List;

import com.rakharafifa.serviceproduct.model.Product;

public interface ProductService {
    List<Product> getAllProduct();
    Product getProductById(Long id);
    Product createProduct(Product product);
    void updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
