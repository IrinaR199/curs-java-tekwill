package com.exam.shop.dto;

import com.exam.shop.enums.OrderStatus;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {
    private Long id;
    private Long userId;
    private LocalDateTime createdAt;
    private OrderStatus status;
    private List<OrderItemDto> items;
}
