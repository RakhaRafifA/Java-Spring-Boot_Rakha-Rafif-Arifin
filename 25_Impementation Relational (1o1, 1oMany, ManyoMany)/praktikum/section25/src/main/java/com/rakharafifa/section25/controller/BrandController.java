package com.rakharafifa.section25.controller;

import java.util.List;

import com.rakharafifa.section25.entity.Brand;
import com.rakharafifa.section25.repository.BrandRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rakhara")
public class BrandController {
    @Autowired
    BrandRepository brandRepository;

    @GetMapping("/brand")
    List<Brand> getAllBrand(){
        return brandRepository.findAll();
    }
}
