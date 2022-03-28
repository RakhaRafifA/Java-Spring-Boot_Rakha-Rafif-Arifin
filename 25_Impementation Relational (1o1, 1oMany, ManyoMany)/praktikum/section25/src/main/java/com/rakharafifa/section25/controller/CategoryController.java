package com.rakharafifa.section25.controller;

import java.util.List;

import com.rakharafifa.section25.entity.Category;
import com.rakharafifa.section25.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rakhara")
public class CategoryController {
    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/category")
    List<Category> getAllCategory(){
        return categoryRepository.findAll();
    }
}
