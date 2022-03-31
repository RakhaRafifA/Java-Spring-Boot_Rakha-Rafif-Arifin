package com.rakharafifa.section25.controller;

import java.util.List;

import com.rakharafifa.section25.entity.Category;
import com.rakharafifa.section25.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rakhara/category")
public class CategoryController {
    CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategorys(){
        List<Category> categorys = categoryService.getAllCategory();
        return new ResponseEntity<>(categorys, HttpStatus.OK);
    }

    @GetMapping("/{category_id}")
    public ResponseEntity<Category> getCategory(@PathVariable Long category_id){
        return new ResponseEntity<>(categoryService.getCategoryById(category_id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Category> saveCategory(@RequestBody Category category){
        Category category2 = categoryService.postCategory(category);
        return new ResponseEntity<>(category2, HttpStatus.CREATED);
    }

    @PutMapping("/{category_id}")
    public ResponseEntity<Category> updateCategory(@PathVariable("category_id") Long category_id,@RequestBody Category category){
        categoryService.updateCategory(category_id, category);
        return new ResponseEntity<>(categoryService.getCategoryById(category_id), HttpStatus.OK);
    }

    @DeleteMapping("/{category_id}")
    public ResponseEntity<Category> deleteCategory(@PathVariable("category_id") Long category_id) {
        categoryService.deleteCategory(category_id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
