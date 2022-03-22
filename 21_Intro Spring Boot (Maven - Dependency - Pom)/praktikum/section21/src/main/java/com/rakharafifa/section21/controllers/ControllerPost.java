package com.rakharafifa.section21.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("POST/v1/messages")
public class ControllerPost {
    
    @PostMapping
    public String get(){
        //Perintah Post digunakan untuk memasukan data pada database
        return "Hello World";
    }
}
