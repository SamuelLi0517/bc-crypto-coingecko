package com.venturenix.demospringbootexercise2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CoingeckoResp {
  private String id;

  private String name;
  private String symbol;
  private String image;

  @JsonProperty(value = "current_price")
  private double currentPrice;

  @JsonProperty(value = "price_change_percentage_24h")
  private double priceChangePercentage24h;

  @JsonProperty(value = "total_volume")
  private long totalVolume;

  @JsonProperty(value = "market_cap")
  private long marketCap;

}
