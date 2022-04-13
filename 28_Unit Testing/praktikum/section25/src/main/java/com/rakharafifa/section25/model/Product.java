package com.rakharafifa.section25.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Product")
public class Product {
    @Id
    private String id;
    private String name;
    private Integer price;
}
