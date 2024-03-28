package com.venturenix.demospringbootexercise2.controller.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.venturenix.demospringbootexercise2.controller.CoingeckoOperation;
import com.venturenix.demospringbootexercise2.exception.Code;
import com.venturenix.demospringbootexercise2.infra.ApiResp;
import com.venturenix.demospringbootexercise2.infra.Mapper;
import com.venturenix.demospringbootexercise2.model.Coingecko;
import com.venturenix.demospringbootexercise2.model.CoingeckoResp;
import com.venturenix.demospringbootexercise2.service.CoingeckoService;

@RestController
@CrossOrigin(origins = "http://localhost:8085")
@RequestMapping(value = "/crypto/coingecko/api/v1")
public class CoingeckoController implements CoingeckoOperation {

  @Autowired
  private CoingeckoService coingeckoService;

  @Autowired
  private Mapper mapper;

  @Override
  public List<CoingeckoResp> getAllData() {
    // System.out.println("checkpoint1");
    List<CoingeckoResp> data = coingeckoService.getDataFromApi().stream()//
        .map(e -> mapper.map3(e))//
        .collect(Collectors.toList());
    // System.out.println("checkpoint2");
    // System.out.println(data);
    return data;
  }

  @Override
  public Coingecko getCoingecko(String key) throws JsonProcessingException {
    return coingeckoService.getCoingecko(key);

  }
}
