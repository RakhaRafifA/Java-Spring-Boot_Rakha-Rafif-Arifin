package com.rakharafifa.section21.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("GET/v1/messages")
public class ControllerGet {
    
    @GetMapping
    public String get(){
        //Perintah get digunakan untuk mengambil data pada database
        return "Hello World";
    }
}
