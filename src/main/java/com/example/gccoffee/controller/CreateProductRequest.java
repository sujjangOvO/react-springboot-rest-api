package com.example.gccoffee.controller;

import com.example.gccoffee.model.Category;

// dto 클래스
public record CreateProductRequest(String productName, Category category, long price, String description) {
}
