package com.spring.dto;

public class User {

  private int id;
  private String loginId;
  private String password;
  private String name;
  private String email;
  private String userType;
  private int deapartmentId;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLoginId() {
    return loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }

  public int getDeapartmentId() {
    return deapartmentId;
  }

  public void setDeapartmentId(int deapartmentId) {
    this.deapartmentId = deapartmentId;
  }

}
