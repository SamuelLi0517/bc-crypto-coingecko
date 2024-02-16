package com.venturenix.demospringbootexercise2.exception;

public class InvalidCurrencyException extends IllegalArgumentException{
  
   public InvalidCurrencyException(Code code) {
    super(code.getMessage());
  }
}
