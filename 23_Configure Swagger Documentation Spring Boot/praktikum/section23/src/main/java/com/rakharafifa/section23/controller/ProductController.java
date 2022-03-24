package com.rakharafifa.section23.controller;

import java.util.List;
import java.util.Optional;

import com.rakharafifa.section23.entities.Product;
import com.rakharafifa.section23.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rakharafifa")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/section23")
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    
    @GetMapping("/section23/{id}")
    public Optional<Product> getDetailedProduct(@PathVariable Long id){
        return productRepository.findById(id);
    }

    @PostMapping("/section23")
    public Product createNewProduct(@RequestBody Product payload){
        return productRepository.save(payload);
    }

    @PutMapping("/section23/{id}")
    public Optional<Product> updateProduct(@PathVariable Long id, @RequestBody Product barang){
        Optional<Product> productById = productRepository.findById(id);
        productById.ifPresent(res ->{
            res.setName(barang.getName());
            res.setDescription(barang.getDescription());
            res.setStock(barang.getStock());
            res.setPrice(barang.getPrice());
        });
        return productById;
    }

    @DeleteMapping("/section23/{id}")
    public void deleteProduct(@PathVariable Long id){
        Optional<Product> productById = productRepository.findById(id);
        productById.ifPresent(res ->{
            productRepository.delete(res);
        });
    }
}

