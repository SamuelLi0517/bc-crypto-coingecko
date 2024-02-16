package com.venturenix.demospringbootexercise2.exception;

public class InvalidCoinException extends IllegalArgumentException{
  
   public InvalidCoinException(Code code) {
    super(code.getMessage());
  }
}
