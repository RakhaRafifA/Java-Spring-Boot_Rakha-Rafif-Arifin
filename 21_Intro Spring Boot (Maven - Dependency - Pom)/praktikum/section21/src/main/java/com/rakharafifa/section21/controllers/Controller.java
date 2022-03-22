package com.rakharafifa.section21.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/messages")
public class Controller {

//Ketiga end point dalam satu class dapat dijalankan
//karena perintah pada postman sesuai dengan mapping
    @GetMapping
    public String get(){
        return "Hello Worlds";
    }

    @PostMapping
    public String post(){
        return "Hello World";
    }

    @DeleteMapping
    public String delete(){
        return "Hello World";
    }
}
