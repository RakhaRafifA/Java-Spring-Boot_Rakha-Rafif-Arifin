package com.rakharafifa.section25.service;

import java.util.List;

import com.rakharafifa.section25.entity.Product;

public interface ProductService {
    //product
    List<Product> getAllProduct();
    Product getProductById(Long product_id);
    Product postProduct(Product product_id);
    void updateProduct(Long product_id, Product product);
    void deleteProduct(Long product_id);
    
}
