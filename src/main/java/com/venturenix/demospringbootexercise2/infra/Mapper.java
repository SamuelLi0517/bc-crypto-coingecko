package com.venturenix.demospringbootexercise2.infra;

import org.springframework.stereotype.Component;
import com.venturenix.demospringbootexercise2.entity.CoingeckoEntity;
import com.venturenix.demospringbootexercise2.model.Coingecko;
import com.venturenix.demospringbootexercise2.model.CoingeckoDTO;
import com.venturenix.demospringbootexercise2.model.CoingeckoResp;

@Component
public class Mapper {
  public static CoingeckoResp map3(Coingecko coingecko){
    return CoingeckoResp.builder()//
    .id(coingecko.getId())//
    .name(coingecko.getName())//
    .image(coingecko.getImage())//
    .symbol(coingecko.getSymbol())//
    .currentPrice(coingecko.getCurrentPrice())//
    .priceChangePercentage24h(coingecko.getPriceChangePercentage24h())//
    .totalVolume(coingecko.getTotalVolume())//
    .marketCap(coingecko.getMarketCap())
    .build();
  }


  public static CoingeckoDTO map(Coingecko coingecko) {
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
       // .athDate(coingecko.getAthDate())//
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

  public CoingeckoEntity map2(Coingecko coingecko) {
    CoingeckoEntity builder =
        CoingeckoEntity.builder().coinName(coingecko.getId())//
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
            .percentage(coingecko.getRoi().getPercentage()).build();

    return builder;
  }
}
