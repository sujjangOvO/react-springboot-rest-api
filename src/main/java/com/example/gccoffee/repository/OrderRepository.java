package com.example.gccoffee.repository;

import com.example.gccoffee.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository {

  Order insert(Order order);

}
