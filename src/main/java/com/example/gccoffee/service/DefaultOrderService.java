package com.example.gccoffee.service;

import com.example.gccoffee.model.Email;
import com.example.gccoffee.model.Order;
import com.example.gccoffee.model.OrderItem;
import com.example.gccoffee.model.OrderStatus;
import com.example.gccoffee.repository.OrderRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Component
public class DefaultOrderService implements OrderService {

  private final OrderRepository orderRepository;

  public DefaultOrderService(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  @Override
  public Order createOrder(Email email, String address, String postcode, List<OrderItem> orderItems) {
    Order order = new Order(
      UUID.randomUUID(),
      email,
      address,
      postcode,
      orderItems,
      OrderStatus.ACCEPTED,
      LocalDateTime.now(),
      LocalDateTime.now());
    return orderRepository.insert(order);
  }

  @Override
  public List<Order> getAllOrders() {
    return orderRepository.findAll();
  }

}
