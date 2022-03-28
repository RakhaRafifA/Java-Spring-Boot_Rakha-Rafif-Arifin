package com.rakharafifa.section24.service;

import java.util.ArrayList;
import java.util.List;

import com.rakharafifa.section24.model.Product;
import com.rakharafifa.section24.repository.ProductRepository;

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
    public List<Product> getAllProduct(){
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    @Override
    public Product getProduct(Long id){
        return productRepository.findById(id).get();
    }

    @Override
    public Product postProduct(Product product){
        return productRepository.save(product);
    }

    @Override
    public void putProduct(Long id, Product product){
        Product products = productRepository.findById(id).get();
        System.out.println(products.toString());
        products.setName(product.getName());
        products.setPrice(product.getPrice());
        productRepository.save(products);
    }

    @Override
    public void deleteProduct(Long product_id){
        productRepository.deleteById(product_id);
    }
}
