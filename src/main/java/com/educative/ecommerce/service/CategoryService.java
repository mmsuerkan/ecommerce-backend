package com.educative.ecommerce.service;

import com.educative.ecommerce.model.Category;
import com.educative.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category readCategory(String categoryName) {
        return categoryRepository.findByCategoryName(categoryName);
    }

    public Optional<Category> readCategory(Integer categoryID) {
        return categoryRepository.findById(categoryID);
    }

    public void createCategory(Category category) {
        categoryRepository.save(category);
    }

    public List<Category> listCategories() {
        return categoryRepository.findAll();
    }

    public void updateCategory(Integer categoryID, Category category) {
        Category oldCategory = categoryRepository.findById(categoryID).get();
        oldCategory.setCategoryName(category.getCategoryName());
        oldCategory.setDescription(category.getDescription());
        oldCategory.setImageUrl(category.getImageUrl());
        categoryRepository.save(oldCategory);
    }
}
