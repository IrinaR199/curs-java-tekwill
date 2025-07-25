package com.exam.shop.service.impl;

import com.exam.shop.dto.OrderDto;
import com.exam.shop.entity.Order;
import com.exam.shop.entity.OrderItem;
import com.exam.shop.entity.Product;
import com.exam.shop.enums.OrderStatus;
import com.exam.shop.mappers.OrderMapper;
import com.exam.shop.repository.OrderItemRepository;
import com.exam.shop.repository.OrderRepository;
import com.exam.shop.repository.ProductRepository;
import com.exam.shop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;
    private final ProductRepository productRepository;

    @Override
    public OrderDto createOrder(OrderDto orderDto){
        Order order = new Order();
        order.setUserId((orderDto.getUserId()));
        order.setCreatedAt(LocalDateTime.now());
        order.setStatus(OrderStatus.PENDING);

        List<OrderItem> items = orderDto.getItems()
                .stream()
                .map(itemDto -> {
                    Product product = productRepository.findById(itemDto.getProductId())
                            .orElseThrow(() -> new RuntimeException("Product not found: " + itemDto.getProductId()));
                    OrderItem orderItem = new OrderItem();
                    orderItem.setProduct(product);
                    orderItem.setQuantity(itemDto.getQuantity());
                    orderItem.setOrder(order);
                    return orderItem;
                }).collect(Collectors.toList());

        order.setItems(items);
        Order savedOrder = orderRepository.save(order);
        orderItemRepository.saveAll(items);

        return OrderMapper.toDto(savedOrder);
    }

    @Override
    public List<OrderDto> getAllOrders() {
        return orderRepository.findAll()
                .stream()
                .map(OrderMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public OrderDto getOrderById(Long id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
        return OrderMapper.toDto(order);
    }

    @Override
    public OrderDto updateOrderStatus(Long id, OrderStatus status) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
        order.setStatus(status);
        return OrderMapper.toDto(orderRepository.save(order));
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}

