package com.rakharafifa.section25.service;

import java.util.List;

import com.rakharafifa.section25.model.Product;
import com.rakharafifa.section25.repository.ProductRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @Override
    public Product create(Product product){
        return productRepository.save(product);
    }

    @Override
    public Product findById(String id){
        return productRepository.findById(id).orElseThrow(() -> {
            throw new Error("Product with id " + id + "is not Found");
        });
    }

    @Override
    public Product update(String id, Product product){
        Product product2 = this.findById(id);
        product2.setName(product.getName());
        product2.setPrice(product.getPrice());
        return productRepository.save(product2);
    }

    @Override
    public void delete(String id){
        Product product = this.findById(id);
        productRepository.delete(product);
    }
}
