package com.venturenix.demospringbootexercise2.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.venturenix.demospringbootexercise2.controller.CoingeckoOperation;
import com.venturenix.demospringbootexercise2.exception.Code;
import com.venturenix.demospringbootexercise2.infra.ApiResponse;
import com.venturenix.demospringbootexercise2.model.Coingecko;
import com.venturenix.demospringbootexercise2.service.CoingeckoService;

@RestController
@RequestMapping(value = "/crypto/coingecko/api/v1")
public class CoingeckoController implements CoingeckoOperation{

  @Autowired
  private CoingeckoService coingeckoService;

  @Override
  public ApiResponse<List<Coingecko>> getAllData() {
  List<Coingecko> data = coingeckoService.getDataFromApi();
    return ApiResponse.<List<Coingecko>>builder()//
        .code(Code.OK.getCode())//
        .message(Code.OK.getMessage())//
        .data(data)//
        .build();//
  }

    @Override
  public Coingecko getCoingecko(String key) throws JsonProcessingException {
    return coingeckoService.getCoingecko(key);
  
}
}