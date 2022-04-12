package com.rakharafifa.serviceproduct.service;

import java.util.ArrayList;
import java.util.List;

import com.rakharafifa.serviceproduct.model.Product;
import com.rakharafifa.serviceproduct.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void updateProduct(Long id, Product product) {
        Product product2 = productRepository.findById(id).get();
        System.out.println(product.toString());
        product2.setProduct_name(product.getProduct_name());
        product2.setPrice(product.getPrice());
        productRepository.save(product2);   
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
    
}
