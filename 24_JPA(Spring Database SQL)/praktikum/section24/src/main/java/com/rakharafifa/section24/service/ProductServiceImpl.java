package com.rakharafifa.section24.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.rakharafifa.section24.model.Product;
import com.rakharafifa.section24.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct(){
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product getProduct(Long id){
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product postProduct(Product barang){
        return productRepository.save(barang);
    }

    @Override
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> putProduct(@PathVariable Long id, @RequestBody Product barang){
        Optional<Product> productById = productRepository.findById(id);
        productById.ifPresent(res ->{
            res.setName(barang.getName());
            res.setPrice(barang.getPrice());
        });
        return productById;
    }
}
