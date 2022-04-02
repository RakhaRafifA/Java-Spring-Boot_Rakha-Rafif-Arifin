package com.rakharafifa.section25.repository;

import com.rakharafifa.section25.model.Product;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    
}
