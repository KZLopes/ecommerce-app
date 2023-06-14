package com.carloslopes.ecommerce.api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
  
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private Long productId;
  
  private String name;
  private String code;
  private String description;
  private String image;
  private double price;
  private int stock;
  
}
