package com.venturenix.demospringbootexercise2.infra;

import lombok.Getter;

@Getter
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
