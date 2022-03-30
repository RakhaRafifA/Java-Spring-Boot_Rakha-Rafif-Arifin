package com.rakharafifa.section25.repository;

import com.rakharafifa.section25.model.TransactionDetail;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionDetailRepository extends MongoRepository<TransactionDetail, String> {
    
}
