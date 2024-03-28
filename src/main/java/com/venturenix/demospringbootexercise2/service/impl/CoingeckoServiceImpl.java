package com.venturenix.demospringbootexercise2.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.venturenix.demospringbootexercise2.entity.CoingeckoEntity;
import com.venturenix.demospringbootexercise2.infra.BcUtil;
import com.venturenix.demospringbootexercise2.infra.Mapper;
import com.venturenix.demospringbootexercise2.infra.RedisHelper;
import com.venturenix.demospringbootexercise2.infra.Scheme;
import com.venturenix.demospringbootexercise2.model.Coingecko;
import com.venturenix.demospringbootexercise2.repository.CoingeckoRepo;
import com.venturenix.demospringbootexercise2.service.CoingeckoService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CoingeckoServiceImpl implements CoingeckoService {

  @Autowired
  private Mapper mapper;

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private RedisHelper redisHelper;

  @Autowired
  private CoingeckoRepo coingeckoRepo;

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
    // System.out.println("checkpoint3");
    UriComponentsBuilder coingeckoUrl = BcUtil.url(Scheme.HTTPS, coingeckoKey, domain, path,
        endpoint, coinsVsCurrency);
    log.info("CoingeckoUrl : " + coingeckoUrl.toUriString());
    // Coingecko[] coingecko =
    //     restTemplate.getForObject(coingeckoUrl, Coingecko[].class);
    // System.out.println("checkpoint4");
    return Arrays.asList(restTemplate.getForObject(coingeckoUrl.toUriString(), Coingecko[].class));

  }

  @Override
  public Coingecko getCoingecko(String key) throws JsonProcessingException {
    UriComponentsBuilder CoingeckoUrl = BcUtil.url(Scheme.HTTPS, coingeckoKey, domain, path,
        endpoint, coinsVsCurrency);
        // System.out.println(CoingeckoUrl);
    Coingecko[] coingecko =
        restTemplate.getForObject(CoingeckoUrl.toUriString(), Coingecko[].class);

    // List<CoingeckoEntity> coingeckoEntity = Arrays.stream(coingecko)//
    // .forEach(mapper.map2(Coingecko coingecko))
    // .collect(Collectors.toList())//
    // .get(0);

    List<CoingeckoEntity> coingeckoEntity =
        Arrays.stream(coingecko).map(coin -> mapper.map2(coin))//
            .collect(Collectors.toList());

    coingeckoRepo.saveAll(coingeckoEntity);

    Coingecko target = Arrays.stream(coingecko)//
        .filter(e -> e.getSymbol().equals(key))//
        .collect(Collectors.toList())//
        .get(0);

    redisHelper.set(key, target);
    return target;
  }

}
