package com.exam.shop.controller;

import com.exam.shop.entity.Category;
import com.exam.shop.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {

    @Autowired
    private final CategoryService categoryService;


    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        System.out.println(">>> Категория получена: " + category.getTitle());
        Category savedCategory = categoryService.createCategory(category);
        System.out.println(">>> Категория сохранена с id: " + savedCategory.getId());
        return savedCategory;
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable Long id, @RequestBody Category category) {
        return categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }
}
