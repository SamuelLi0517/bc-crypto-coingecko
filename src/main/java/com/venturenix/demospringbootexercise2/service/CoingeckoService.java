package com.venturenix.demospringbootexercise2.service;

import java.util.List;
import com.venturenix.demospringbootexercise2.model.Coingecko;

public interface CoingeckoService {
  
  List<Coingecko> getDataFromApi();
}
