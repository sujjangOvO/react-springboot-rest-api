package com.example.gccoffee.controller;

import com.example.gccoffee.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public String productsPage(Model model) {
        var orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        return "order-list";
    }
}
