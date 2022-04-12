package com.rakharafifa.servicestock.service;

import java.util.ArrayList;
import java.util.List;

import com.rakharafifa.servicestock.model.Stock;
import com.rakharafifa.servicestock.repository.StockRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {
    StockRepository stockRepository;

    @Autowired
    public StockServiceImpl(StockRepository stockRepository){
        this.stockRepository = stockRepository;
    }
    
    @Override
    public List<Stock> getAllStock() {
        List<Stock> stock = new ArrayList<>();
        stockRepository.findAll().forEach(stock::add);
        return stock;
    }

    @Override
    public Stock getStockById(Long id) {
        return stockRepository.findById(id).get();
    }

    @Override
    public Stock createStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public void updateStock(Long id, Stock stock) {
        Stock stock2 = stockRepository.findById(id).get();
        System.out.println(stock.toString());
        stock2.setQuantity(stock.getQuantity());
        stock2.setVendor(stock.getVendor());
        stockRepository.save(stock2);
    }

    @Override
    public void deleteStock(Long id) {
        stockRepository.deleteById(id);  
    }
    
}
