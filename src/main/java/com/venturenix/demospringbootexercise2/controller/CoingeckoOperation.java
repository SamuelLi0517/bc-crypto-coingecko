package com.venturenix.demospringbootexercise2.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.venturenix.demospringbootexercise2.infra.ApiResponse;
import com.venturenix.demospringbootexercise2.model.Coingecko;

public interface CoingeckoOperation {

  @GetMapping("/coins")
  public ApiResponse<List<Coingecko>> getAllData();
  
    @GetMapping(value = "/Coingecko")
    Coingecko getCoingecko(@RequestParam String key) throws JsonProcessingException;

}
