package com.exam.shop.controller;

import com.exam.shop.dto.OrderDto;
import com.exam.shop.enums.OrderStatus;
import com.exam.shop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    // Создание заказа
    @PostMapping
    public OrderDto createOrder(@RequestBody OrderDto orderDto) {
        return orderService.createOrder(orderDto);
    }

    // Получение всех заказов
    @GetMapping
    public List<OrderDto> getAllOrders() {
        return orderService.getAllOrders();
    }

    // Получение заказа по ID
    @GetMapping("/{id}")
    public OrderDto getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    // Обновление статуса заказа
    @PutMapping("/{id}")
    public OrderDto updateOrderStatus(@PathVariable Long id, @RequestParam("status") OrderStatus status) {
        return orderService.updateOrderStatus(id, status);
    }

    // Удаление заказа
    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
    }
}

