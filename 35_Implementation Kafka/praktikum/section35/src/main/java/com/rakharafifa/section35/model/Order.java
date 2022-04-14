package com.rakharafifa.section35.model;

import org.springframework.kafka.annotation.KafkaListener;

public class Order {
    @KafkaListener(topics = "product_catalog, user", groupId = "section35")
    public void listenProduct(String msg){
        System.out.println(msg);
    }
}
