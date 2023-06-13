package com.carloslopes.ecommerce.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
  private String name;
  private String code;
  private String details;
  
  @OneToOne(mappedBy = "price")
  private PriceTable price;
  
}
