package com.venturenix.demospringbootexercise2.infra;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.venturenix.demospringbootexercise2.entity.CoingeckoEntity;
import com.venturenix.demospringbootexercise2.model.Coingecko;
import com.venturenix.demospringbootexercise2.model.CoingeckoDTO;

@Component
public class Mapper {

  @Autowired
  ModelMapper modelMapper;

  public CoingeckoDTO map(Coingecko coingecko) {
    CoingeckoDTO builder = CoingeckoDTO.builder()//
        .id(coingecko.getId())//
        .symbol(coingecko.getSymbol())//
        .name(coingecko.getName())//
        .image(coingecko.getImage())//
        .currentPrice(coingecko.getCurrentPrice())//
        .marketCap(coingecko.getMarketCap())//
        .marketCapRank(coingecko.getMarketCapRank())//
        .totalVolume(coingecko.getTotalVolume())//
        .high24h(coingecko.getHigh24h())//
        .low24h(coingecko.getLow24h())//
        .priceChange24h(coingecko.getPriceChange24h())//
        .priceChangePercentage24h(coingecko.getPriceChangePercentage24h())//
        .marketCapChange24h(coingecko.getMarketCapChange24h())//
        .marketCapChangePercentage24h(
            coingecko.getMarketCapChangePercentage24h())//
        .circulatingSupply(coingecko.getCirculatingSupply())//
        .totalSupply(coingecko.getTotalSupply()).ath(coingecko.getAth())//
        .athChangePercentage(coingecko.getAthChangePercentage())//
        .athDate(coingecko.getAthDate())//
        .lastUpdated(coingecko.getLastUpdated())//
        .build();

    if (coingecko.getRoi() != null) {
      builder.getRoi().builder()//
          .times(coingecko.getRoi().getTimes())//
          .currency(coingecko.getRoi().getCurrency())//
          .percentage(coingecko.getRoi().getPercentage())//
          .build();
    }
    return builder;
  }

public CoingeckoEntity map2(Coingecko coingecko){
  CoingeckoEntity builder = CoingeckoEntity.builder()
  .coinName(coingecko.getId())//
  .symbol(coingecko.getSymbol())//
  .name(coingecko.getName())//
  .image(coingecko.getImage())//
  .currentPrice(coingecko.getCurrentPrice())//
  .marketCap(coingecko.getMarketCap())//
  .marketCapRank(coingecko.getMarketCapRank())//
  .totalVolume(coingecko.getTotalVolume())//
  .high24h(coingecko.getHigh24h())//
  .low24h(coingecko.getLow24h())//
  .priceChange24h(coingecko.getPriceChange24h())//
  .priceChangePercentage24h(coingecko.getPriceChangePercentage24h())//
  .marketCapChange24h(coingecko.getMarketCapChange24h())//
  .marketCapChangePercentage24h(
      coingecko.getMarketCapChangePercentage24h())//
  .circulatingSupply(coingecko.getCirculatingSupply())//
  .totalSupply(coingecko.getTotalSupply()).ath(coingecko.getAth())//
  .athChangePercentage(coingecko.getAthChangePercentage())//
  .athDate(coingecko.getAthDate())//
  .lastUpdated(coingecko.getLastUpdated())//
  .times(coingecko.getRoi().getTimes())
  .currency(coingecko.getRoi().getCurrency())
  .percentage(coingecko.getRoi().getPercentage())
  .build();

  return builder;
}}
