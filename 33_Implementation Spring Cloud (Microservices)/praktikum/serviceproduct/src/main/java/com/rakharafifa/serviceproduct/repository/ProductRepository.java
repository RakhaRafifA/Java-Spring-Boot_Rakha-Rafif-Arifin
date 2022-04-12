package com.rakharafifa.serviceproduct.repository;

import com.rakharafifa.serviceproduct.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
