package com.exam.shop.repository;

import com.exam.shop.entity.Category;
import com.exam.shop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(Category category);                     // по объекту Category
    List<Product> findByCategoryId(Long categoryId);
    List<Product> findByCategoryTitle(String categoryTitle);   // по имени категории
    List<Product> findProductByTitle(String productTitle);
}
