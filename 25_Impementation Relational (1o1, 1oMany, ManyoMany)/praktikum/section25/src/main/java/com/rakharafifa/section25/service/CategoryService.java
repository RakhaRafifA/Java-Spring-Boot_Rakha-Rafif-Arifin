package com.rakharafifa.section25.service;

import java.util.List;

import com.rakharafifa.section25.entity.Category;

public interface CategoryService {

    List<Category> getAllCategory();
    Category getCategoryById(Long category_id);
    Category postCategory(Category category_id);
    void updateCategory(Long category_id, Category category);
    void deleteCategory(Long category_id);
    
}
