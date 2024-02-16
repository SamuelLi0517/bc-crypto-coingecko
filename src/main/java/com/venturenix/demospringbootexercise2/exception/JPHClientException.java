package com.venturenix.demospringbootexercise2.exception;

public class JPHClientException extends BusinessRuntimeException{
  
  public JPHClientException(Code code) {
    super(code);
    
  }
}
