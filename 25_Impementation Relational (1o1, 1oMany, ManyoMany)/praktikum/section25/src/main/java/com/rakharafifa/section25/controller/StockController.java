package com.rakharafifa.section25.controller;

import java.util.List;

import com.rakharafifa.section25.entity.Stock;
import com.rakharafifa.section25.repository.StockRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StockController {
    @Autowired
    StockRepository stockRepository;

    @GetMapping("/stock")
    List<Stock> getAllStock(){
        return stockRepository.findAll();
    }
}
