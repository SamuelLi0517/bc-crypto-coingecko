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
  // public CoingeckoEntity mapToEntity(Coingecko data) {
  // CoingeckoEntity.CoingeckoEntityBuilder builder = CoingeckoEntity.builder()
  // .coinName(data.getId())
  // .symbol(data.getSymbol())
  // .name(data.getName())
  // .image(data.getImage())
  // .currentPrice(data.getCurrentPrice())
  // .marketCap(data.getMarketCap())
  // .marketCapRank(data.getMarketCapRank())
  // .totalVolume(data.getTotalVolume())
  // .high24h(data.getHigh24h())
  // .low24h(data.getLow24h())
  // .priceChange24h(data.getPriceChange24h())
  // .priceChangePercentage24h(data.getPriceChangePercentage24h())
  // .marketCapChange24h(data.getMarketCapChange24h())
  // .marketCapChangePercentage24h(data.getMarketCapChangePercentage24h())
  // .circulatingSupply(data.getCirculatingSupply())
  // .totalSupply(data.getTotalSupply())
  // .ath(data.getAth())
  // .athChangePercentage(data.getAthChangePercentage())
  // .athDate(data.getAthDate())
  // .lastUpdated(data.getLastUpdated());

  // if (data.getRoi() != null) {
  // builder.times(data.getRoi().getTimes())
  // .currency(data.getRoi().getCurrency())
  // .percentage(data.getRoi().getPercentage());
  // }

  // return builder.build();
  // }
}
