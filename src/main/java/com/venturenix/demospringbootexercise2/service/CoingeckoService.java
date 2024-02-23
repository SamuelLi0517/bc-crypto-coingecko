package com.venturenix.demospringbootexercise2.service;

import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.venturenix.demospringbootexercise2.model.Coingecko;

public interface CoingeckoService {

  List<Coingecko> getDataFromApi();

  Coingecko getCoingecko(String key) throws JsonProcessingException;



}
