package com.venturenix.demospringbootexercise2.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.venturenix.demospringbootexercise2.infra.BcUtil;
import com.venturenix.demospringbootexercise2.infra.Mapper;
import com.venturenix.demospringbootexercise2.infra.Scheme;
import com.venturenix.demospringbootexercise2.model.Coingecko;
import com.venturenix.demospringbootexercise2.service.CoingeckoService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CoingeckoServiceImpl implements CoingeckoService {

  @Autowired
  private Mapper mapper;

  @Autowired
  private RestTemplate restTemplate;

  @Value("${api.coingecko.key}")
  private String coingeckoKey;

  @Value("${api.coingecko.domain}")
  private String domain;

  @Value("${api.coingecko.path}")
  private String path;

  @Value("${api.coingecko.endpoint}")
  private String endpoint;

  @Value("${api.coingecko.coins.vs_currency}")
  private String coinsVsCurrency;


  @Override
  public List<Coingecko> getDataFromApi() {

    RestTemplate restTemplate = new RestTemplate();
    String CoingeckoUrl = BcUtil.url(Scheme.HTTPS, coingeckoKey, domain, path,
        endpoint, coinsVsCurrency);
    log.info("CoingeckoUrl : " + CoingeckoUrl);
    Coingecko[] coingecko =
        restTemplate.getForObject(CoingeckoUrl, Coingecko[].class);

    return Arrays.stream(coingecko).collect(Collectors.toList());

  }

}
