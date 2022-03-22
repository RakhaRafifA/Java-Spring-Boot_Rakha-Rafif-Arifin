package com.rakharafifa.section21.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("DELETE/v1/messages")
public class ControllerDelete {

    //Perintah delete digunakan untuk menghapus data pada database
    @DeleteMapping 
    public String delete(){
        return "Hello World";
    }
}
