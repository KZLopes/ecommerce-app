package com.carloslopes.ecommerce.api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "user_id", referencedColumnName = "userId")
  @ToString.Exclude
  private String user;
  
  private String type;
  private String complement;
  private String Country;
  private String City;
  private String zipCode;
  private String region;
  private String street;
  private Number number;
  
}
