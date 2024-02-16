package com.venturenix.demospringbootexercise2.exception;

public class ResourceNotFound extends BusinessRuntimeException{
  
  public ResourceNotFound(Code code) {
    super(code);
  }
}