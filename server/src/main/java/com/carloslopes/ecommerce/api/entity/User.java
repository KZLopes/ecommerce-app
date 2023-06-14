package com.carloslopes.ecommerce.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String userId;
  private String email;
  private String password;
  private String firstName;
  private String lastName;
  private String gender;
  // Can user have multiple addresses?
  // If so these should be in another table
  private String address;
  
  private String phoneOne;
  private String phoneTwo;
  private String membershipPlan;
  private Date membershipExpiry;
  
}
