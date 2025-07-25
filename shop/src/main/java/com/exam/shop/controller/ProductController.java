package com.exam.shop.controller;

import com.exam.shop.dto.ProductDto;
import com.exam.shop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        return productService.createProduct(productDto);
    }

    //посмотреть все товары
    @GetMapping
    public List<ProductDto> getAllProducts (){
        return productService.getAllProducts();
    }


    //посмотреть все товары по id категории
    @GetMapping("/category/id/{categoryId}")
    public List<ProductDto> getAllProductsByCategoryId(@PathVariable Long categoryId) {
        return productService.getAllProductsByCategoryId(categoryId);
    }

    //посмотреть все товары по name категории
    @GetMapping("/category/name/{categoryName}")
    public List<ProductDto> getAllProductsByCategoryName(@PathVariable String categoryName) {
        return productService.getAllProductsByCategoryName(categoryName);
    }


    //посмотреть товар по ID
    @GetMapping("/id/{id}")
    public ProductDto getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }


    //посмотреть товар по названию
    @GetMapping("/title/{title}")
    public List<ProductDto> getAllProductsByName(@PathVariable String title) {
        return productService.getAllProductsByName(title);
    }

    //удаление товара
    @DeleteMapping("/products/id/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

    //доступ для покупателя
    //доступ для работника магазина
    //купить товар
    //посмотреть товар по названию
    //посмотреть все товары по категории
    //посмотреть товар по ID
    //добавить новый товар



    //редактирование товара

}
