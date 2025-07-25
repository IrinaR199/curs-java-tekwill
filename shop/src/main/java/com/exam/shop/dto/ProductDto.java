package com.exam.shop.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private String title;
    private Double price;
    private String description;
    private String category;
    private boolean available;
}
