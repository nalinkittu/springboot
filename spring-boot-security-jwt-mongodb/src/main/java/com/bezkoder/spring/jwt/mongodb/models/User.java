package com.bezkoder.spring.jwt.mongodb.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
  @Id
  private String id;

  @NotBlank
  @Size(max = 20)
  private String username;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  @NotBlank
  @Size(max = 120)
  private String password;

  @DBRef
  private Set<Role> roles = new HashSet<>();
  
  @NotBlank
  @Size(max = 20)
  private String name;
  
  @NotBlank
  @Size(max = 10)
  private String phoneNumber;
  
  @NotBlank
  @Size(max = 120)
  private String address;
  
  @NotBlank
  private Integer assignedStorage;
  
  private BigDecimal usedStorage;
  
  private Integer isActive;
  
  private LocalDate createdAt;
  
  private LocalDate updatedAt;
  

  public User() {
  }

  public User(String username, String email, String password, String name, 
		  String phoneNumber, String address, Integer assignedStorage) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.assignedStorage = assignedStorage;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Integer getAssignedStorage() {
	return assignedStorage;
}

public void setAssignedStorage(Integer assignedStorage) {
	this.assignedStorage = assignedStorage;
}

public BigDecimal getUsedStorage() {
	return usedStorage;
}

public void setUsedStorage(BigDecimal usedStorage) {
	this.usedStorage = usedStorage;
}

public Integer getIsActive() {
	return isActive;
}

public void setIsActive(Integer isActive) {
	this.isActive = isActive;
}

public LocalDate getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(LocalDate createdAt) {
	this.createdAt = createdAt;
}

public LocalDate getUpdatedAt() {
	return updatedAt;
}

public void setUpdatedAt(LocalDate updatedAt) {
	this.updatedAt = updatedAt;
}
}
