package com.rakharafifa.section25.service;

import java.util.List;

import com.rakharafifa.section25.model.Transaction;

public interface TransactionService {
    
    Transaction create(Transaction transaction);
    List<Transaction> findAll();
    Transaction findById(String id);
    Transaction update(String id, Transaction transaction);
    void delete(String id);
}
