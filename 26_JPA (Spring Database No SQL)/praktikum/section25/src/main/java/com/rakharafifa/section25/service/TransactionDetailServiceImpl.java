package com.rakharafifa.section25.service;

import java.util.List;

import com.rakharafifa.section25.model.TransactionDetail;
import com.rakharafifa.section25.repository.TransactionDetailRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TransactionDetailServiceImpl implements TransactionDetailService {
    private final TransactionDetailRepository transactionDetailRepository;

    @Override
    public List<TransactionDetail> findAll(){
        return transactionDetailRepository.findAll();
    }

    @Override
    public TransactionDetail create(TransactionDetail transactionDetail){
        return transactionDetailRepository.save(transactionDetail);
    }

    @Override
    public TransactionDetail findById(String id){
        return transactionDetailRepository.findById(id).orElseThrow(() -> {
            throw new Error("TransactionDetail with id " + id + "is not Found");
        });
    }

    @Override
    public TransactionDetail update(String id, TransactionDetail transactionDetail){
        TransactionDetail transactionDetail2 = this.findById(id);
        transactionDetail2.setProduct_id(transactionDetail.getProduct_id());
        transactionDetail2.setTransaction_id(transactionDetail.getTransaction_id());
        transactionDetail2.setQuantity(transactionDetail.getQuantity());
        return transactionDetailRepository.save(transactionDetail2);
    }

    @Override
    public void delete(String id){
        TransactionDetail transactionDetail = this.findById(id);
        transactionDetailRepository.delete(transactionDetail);
    }
}
