package com.rakharafifa.servicestock.repository;

import com.rakharafifa.servicestock.model.Stock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
    
}
