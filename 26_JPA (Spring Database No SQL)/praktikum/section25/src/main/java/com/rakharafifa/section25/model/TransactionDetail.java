package com.rakharafifa.section25.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("TransactionDetail")
public class TransactionDetail {
    @Id
    private String id;
    private String transaction_id;
    private String product_id;
    private Integer quantity;
}
