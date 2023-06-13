package com.carloslopes.ecommerce.api.service;

import com.carloslopes.ecommerce.api.entity.Product;
import com.carloslopes.ecommerce.api.repository.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService{
  
  private ProductRepository repository;
  
  @Override
  public List<Product> getProductsList() {
    return repository.findAll();
  }
}
