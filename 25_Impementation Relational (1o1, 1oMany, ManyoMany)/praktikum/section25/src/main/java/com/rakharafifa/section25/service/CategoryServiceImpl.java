package com.rakharafifa.section25.service;

import java.util.ArrayList;
import java.util.List;

import com.rakharafifa.section25.entity.Category;
import com.rakharafifa.section25.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
    @Override
    public List<Category> getAllCategory(){
        List<Category> categorys = new ArrayList<>();
        categoryRepository.findAll().forEach(categorys::add);
        return categorys;
    }

    @Override
    public Category getCategoryById(Long category_id){
        return categoryRepository.findById(category_id).get();
    }

    @Override
    public Category postCategory(Category category){
        return categoryRepository.save(category);
    }

    @Override
    public void updateCategory(Long category_id, Category category){
        Category categorys = categoryRepository.findById(category_id).get();
        System.out.println(categorys.toString());
        categorys.setCategory_name(category.getCategory_name());
        categoryRepository.save(categorys);
    }

    @Override
    public void deleteCategory(Long category_id){
        categoryRepository.deleteById(category_id);
    }
}
