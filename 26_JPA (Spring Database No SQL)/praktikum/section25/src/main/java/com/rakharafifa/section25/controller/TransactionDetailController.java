package com.rakharafifa.section25.controller;

import java.util.List;

import com.rakharafifa.section25.model.TransactionDetail;
import com.rakharafifa.section25.service.TransactionDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/details")
public class TransactionDetailController {
    @Autowired
    private TransactionDetailService transactionDetailService;

    @GetMapping
    public ResponseEntity<List<TransactionDetail>> listTransactionDetail(){
        List<TransactionDetail> transactionDetails = transactionDetailService.findAll();
        return ResponseEntity.ok(transactionDetails);
    }

    @PostMapping
    public ResponseEntity<TransactionDetail> create(@RequestBody TransactionDetail transactionDetail){
        TransactionDetail createTransactionDetail = transactionDetailService.create(transactionDetail);
        return ResponseEntity.ok(createTransactionDetail);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> transactionDetail(@PathVariable("id") String id){
        try{
            TransactionDetail transactionDetail = transactionDetailService.findById(id);
            return ResponseEntity.ok(transactionDetail);
        } catch (Exception e) {
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") String id, @RequestBody TransactionDetail transactionDetail){
        try {
            TransactionDetail transactionDetail2 = transactionDetailService.update(id, transactionDetail);
            return ResponseEntity.ok(transactionDetail2);
        } catch (Exception e) {
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") String id){
        try {
            transactionDetailService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }
}
