package com.exam.shop.service;

import com.exam.shop.dto.ProductDto;
import com.exam.shop.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public interface ProductService {

    ProductDto createProduct(ProductDto productDto);
    List<ProductDto> getAllProducts();
    List<ProductDto> getAllProductsByCategoryId(Long categoryId);
    List<ProductDto> getAllProductsByCategoryName(String categoryName);
    ProductDto getProductById(Long id);
    List<ProductDto> getAllProductsByName(String title);
    ProductDto updateProduct(Long id, ProductDto dto);
    void deleteProduct(Long id);
}
