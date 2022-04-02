package com.rakharafifa.section25.service;

import java.util.List;

import com.rakharafifa.section25.model.Transaction;
import com.rakharafifa.section25.repository.TransactionRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;

    @Override
    public List<Transaction> findAll(){
        return transactionRepository.findAll();
    }

    @Override
    public Transaction create(Transaction transaction){
        return transactionRepository.save(transaction);
    }

    @Override
    public Transaction findById(String id){
        return transactionRepository.findById(id).orElseThrow(() -> {
            throw new Error("Transaction with id " + id + "is not Found");
        });
    }

    @Override
    public Transaction update(String id, Transaction transaction){
        Transaction transaction2 = this.findById(id);
        transaction2.setCustomer_name(transaction.getCustomer_name());
        transaction2.setTransaction_details(transaction.getTransaction_details());
        transaction2.setIs_paid(transaction.getIs_paid());
        return transactionRepository.save(transaction2);
    }

    @Override
    public void delete(String id){
        Transaction transaction = this.findById(id);
        transactionRepository.delete(transaction);
    }
}
