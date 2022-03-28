package com.rakharafifa.section25.service;

import java.util.List;

import com.rakharafifa.section25.entity.Stock;

public interface StockService {

    List<Stock> getAllStock();
    Stock getStockById(Long stock_id);
    Stock postStock(Stock stock_id);
    void updateStock(Long stock_id, Stock stock);
    void deleteStock(Long stock_id);
    
}
