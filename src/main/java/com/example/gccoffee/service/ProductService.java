package com.example.gccoffee.service;

import com.example.gccoffee.model.Category;
import com.example.gccoffee.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

  List<Product> getProductsByCategory(Category category);

  List<Product> getAllProducts();

  Product createProduct(String productName, Category category, long price);

  Product createProduct(String productName, Category category, long price, String description);

}
