package com.venturenix.demospringbootexercise2.exception;

import lombok.Getter;

@Getter
public enum Code {
  OK("000000", "OK."), //
  NOTFOUND("100000", "Not Found."), //
  JPH_NOT_AVAILABLE("100001", "JsonplaceHolder API is unavailable"),
  NPE_EXCEPTION("900000", "Runtime Exception"),
  GENERAL_EXCEPTION("999999", "General Exception."),
  INVALID_COIN("200000", "Not Found the Coin."),
  INVALID_CURRENCY("30000", "Not Found the Currency.")
  ;
  

  private String code;
  private String message;

  private Code (String code, String message){
    this.code = code;
    this.message = message;
  }
}
