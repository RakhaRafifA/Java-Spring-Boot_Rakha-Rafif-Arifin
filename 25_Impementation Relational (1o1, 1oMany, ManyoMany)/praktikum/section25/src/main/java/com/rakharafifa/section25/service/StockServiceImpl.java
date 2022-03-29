package com.rakharafifa.section25.service;

import java.util.ArrayList;
import java.util.List;

import com.rakharafifa.section25.entity.Stock;
import com.rakharafifa.section25.repository.StockRepository;

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
    public List<Stock> getAllStock(){
        List<Stock> stocks = new ArrayList<>();
        stockRepository.findAll().forEach(stocks::add);
        return stocks;
    }

    @Override
    public Stock getStockById(Long stock_id){
        return stockRepository.findById(stock_id).get();
    }

    @Override
    public Stock postStock(Stock stock){
        return stockRepository.save(stock);
    }

    @Override
    public void updateStock(Long stock_id, Stock stock){
        Stock stocks = stockRepository.findById(stock_id).get();
        System.out.println(stocks.toString());
        stock.setProduct_id(stock.getProduct_id());
        stocks.setQuantity(stock.getQuantity());
        stockRepository.save(stocks);
    }

    @Override
    public void deleteStock(Long stock_id){
        stockRepository.deleteById(stock_id);
    }
}
