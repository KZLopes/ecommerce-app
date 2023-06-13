package com.carloslopes.ecommerce.api.controller;

import com.carloslopes.ecommerce.api.entity.Product;
import com.carloslopes.ecommerce.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
  
  @Autowired
  private ProductService productService;
  
  @GetMapping("/products")
  public List<Product> getAllProducts() {
    return productService.getProductsList();
  }

}
