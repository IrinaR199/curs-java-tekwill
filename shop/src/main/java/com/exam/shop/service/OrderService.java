package com.exam.shop.service;

import com.exam.shop.dto.OrderDto;
import com.exam.shop.enums.OrderStatus;

import java.util.List;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDto);
    List<OrderDto> getAllOrders();
    OrderDto getOrderById(Long id);
    OrderDto updateOrderStatus(Long id, OrderStatus status);
    void deleteOrder(Long id);
}
