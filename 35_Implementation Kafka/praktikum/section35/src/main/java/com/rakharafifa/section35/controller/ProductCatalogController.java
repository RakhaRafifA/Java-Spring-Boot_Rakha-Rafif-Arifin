package com.rakharafifa.section35.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rakha/product")
public class ProductCatalogController {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public ResponseEntity<String> sendMessage() throws Exception{
        kafkaTemplate.send("product_catalog", "product1");
        return new ResponseEntity<>("Product ditambahkan ", HttpStatus.OK);
    }

    @GetMapping
    @KafkaListener(topics = "product_catalog", groupId = "section35")
    public void getMessage(String message){
        System.out.println("Message dari product : " + message);
    }
}
