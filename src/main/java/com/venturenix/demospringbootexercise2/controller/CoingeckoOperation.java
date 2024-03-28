package com.venturenix.demospringbootexercise2.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.venturenix.demospringbootexercise2.infra.ApiResp;
import com.venturenix.demospringbootexercise2.model.Coingecko;
import com.venturenix.demospringbootexercise2.model.CoingeckoResp;

public interface CoingeckoOperation {

  @GetMapping("/coins")
  List<CoingeckoResp>getAllData();
  
  @GetMapping(value = "/Coingecko")
  Coingecko getCoingecko(@RequestParam String key) throws JsonProcessingException;

}
