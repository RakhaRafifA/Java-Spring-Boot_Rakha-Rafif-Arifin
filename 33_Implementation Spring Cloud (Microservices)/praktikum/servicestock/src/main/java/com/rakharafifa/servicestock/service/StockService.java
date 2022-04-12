package com.rakharafifa.servicestock.service;

import java.util.List;

import com.rakharafifa.servicestock.model.Stock;

public interface StockService {
    List<Stock> getAllStock();
    Stock getStockById(Long id);
    Stock createStock(Stock stock);
    void updateStock(Long id, Stock stock);
    void deleteStock(Long id);
}
