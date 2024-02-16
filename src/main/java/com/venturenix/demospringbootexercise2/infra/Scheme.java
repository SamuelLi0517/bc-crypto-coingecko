package com.venturenix.demospringbootexercise2.infra;

public enum Scheme {
  
  HTTPS("https"), HTTP("http");

  public String lowercaseName(){
    return this.name().toLowerCase();
  }

  private String protocol;

  Scheme(String protocol) {
    this.protocol = protocol;
  }
  
}
