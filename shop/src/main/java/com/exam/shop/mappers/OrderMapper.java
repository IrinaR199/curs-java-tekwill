package com.exam.shop.mappers;

import com.exam.shop.dto.OrderDto;
import com.exam.shop.dto.OrderItemDto;
import com.exam.shop.entity.Order;
import com.exam.shop.entity.OrderItem;

import java.util.stream.Collectors;

public class OrderMapper {

    public static OrderDto toDto(Order order) {
        return OrderDto.builder()
                .id(order.getId())
                .userId(order.getUserId())
                .createdAt(order.getCreatedAt())
                .status(order.getStatus())
                .items(order.getItems().stream()
                        .map(OrderMapper::toItemDto)
                        .collect(Collectors.toList()))
                .build();
    }

    public static OrderItemDto toItemDto(OrderItem item) {
        return OrderItemDto.builder()
                .productId(item.getProduct().getId())
                .quantity(item.getQuantity())
                .build();
    }
}
