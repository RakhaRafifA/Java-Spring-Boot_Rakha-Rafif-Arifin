package com.rakharafifa.servicestock.controller;

import java.util.List;

import com.rakharafifa.servicestock.model.Stock;
import com.rakharafifa.servicestock.service.StockService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {
    StockService stockService;

    @Autowired
    public StockController(StockService stockService){
        this.stockService = stockService;
    }

    @GetMapping
    public ResponseEntity<List<Stock>> getAllStock(){
        List<Stock> stock = stockService.getAllStock();
        return new ResponseEntity<>(stock, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Stock> getStockById(Long id){
        return new ResponseEntity<>(stockService.getStockById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Stock> createStock(@RequestBody Stock stock){
        Stock stock2 = stockService.createStock(stock);
        return new ResponseEntity<>(stock2, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Stock> updateStock(@PathVariable Long id, @RequestBody Stock stock){
        stockService.updateStock(id, stock);
        return new ResponseEntity<>(stockService.getStockById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Stock> deleteStock(@PathVariable Long id){
        stockService.deleteStock(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
