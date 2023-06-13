package com.carloslopes.ecommerce.api.repository;

import com.carloslopes.ecommerce.api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
