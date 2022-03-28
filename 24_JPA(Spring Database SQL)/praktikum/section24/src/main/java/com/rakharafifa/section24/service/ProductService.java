package com.rakharafifa.section24.service;

import java.util.List;

import com.rakharafifa.section24.model.Product;

public interface ProductService {

    List<Product> getAllProduct();
    Product getProduct(Long id);
    Product postProduct(Product id);
    void deleteProduct(Long id);
    void putProduct(Long id, Product product);
}
