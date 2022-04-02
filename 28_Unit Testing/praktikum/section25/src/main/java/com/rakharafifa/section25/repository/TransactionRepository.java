package com.rakharafifa.section25.repository;

import com.rakharafifa.section25.model.Transaction;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String> {
    
}
