package com.carloslopes.ecommerce.api.service;

import com.carloslopes.ecommerce.api.entity.Product;

import java.util.List;

public interface ProductService {
  List<Product> getProductsList();
}
