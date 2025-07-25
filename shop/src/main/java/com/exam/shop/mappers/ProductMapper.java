package com.exam.shop.mappers;

import com.exam.shop.dto.ProductDto;
import com.exam.shop.entity.Category;
import com.exam.shop.entity.Product;

public class ProductMapper {
    public static ProductDto toDto(Product product) {
        return ProductDto.builder()
                .title(product.getTitle())
                .price(product.getPrice())
                .description(product.getDescription())
                .category(product.getCategory() != null ? product.getCategory().getTitle() : null)
                .available(product.isAvailable())
                .build();
    }

    public static Product toEntity(ProductDto dto, Category category) {
        Product product = new Product();
        product.setTitle(dto.getTitle());
        product.setPrice(dto.getPrice());
        product.setDescription(dto.getDescription());
        product.setAvailable(dto.isAvailable());
        product.setCategory(category);
        return product;
    }

    public static void updateEntity(Product product, ProductDto dto, Category category) {
        product.setTitle(dto.getTitle());
        product.setPrice(dto.getPrice());
        product.setDescription(dto.getDescription());
        product.setAvailable(dto.isAvailable());
        product.setCategory(category);
    }

}