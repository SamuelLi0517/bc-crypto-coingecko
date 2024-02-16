package com.venturenix.demospringbootexercise2.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.venturenix.demospringbootexercise2.infra.ApiResponse;
import com.venturenix.demospringbootexercise2.model.Coingecko;

public interface CoingeckoOperation {

  @GetMapping("/")
  public ApiResponse<List<Coingecko>> getAllData();
  
}
