package com.venturenix.demospringbootexercise2.infra;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApiResponse <T>{

  private String code;

  private String message;

  private T data;
}
