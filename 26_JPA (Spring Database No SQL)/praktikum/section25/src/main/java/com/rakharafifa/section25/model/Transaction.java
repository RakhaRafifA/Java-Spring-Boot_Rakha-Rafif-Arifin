package com.rakharafifa.section25.model;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Transaction")
public class Transaction {
    @Id
    private String id;
    private String customer_name;
    private String transaction_details;
    private String is_paid;
    private Timestamp created_at;
}
