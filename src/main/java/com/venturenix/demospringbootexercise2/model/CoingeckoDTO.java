package com.venturenix.demospringbootexercise2.model;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@Data
// @ToString
@Getter
public class CoingeckoDTO {
  private String id;// Bitcoin
  private String symbol;// "btc"
  private String name;
  private String image;

  @JsonProperty(value = "current_price")
  private double currentPrice;

  @JsonProperty(value = "market_cap")
  private long marketCap;

  @JsonProperty(value = "market_cap_rank")
  private long marketCapRank;

  @JsonProperty(value = "fully_diluted_valuation")
  private long fullyDilutedValuation;

  @JsonProperty(value = "total_volume")
  private long totalVolume;

  @JsonProperty(value = "high_24h")
  private double high24h;

  @JsonProperty(value = "low_24")
  private double low24h;

  @JsonProperty(value = "price_change_24h")
  private double priceChange24h;

  @JsonProperty(value = "price_change_percentage_24h")
  private double priceChangePercentage24h;

  @JsonProperty(value = "market_cap_change_24h")
  private double marketCapChange24h;

  @JsonProperty(value = "market_cap_change_percentage_24h")
  private double marketCapChangePercentage24h;

  @JsonProperty(value = "circulating_supply")
  private double circulatingSupply;

  @JsonProperty(value = "total_supply")
  private double totalSupply;

  @JsonProperty(value = "max_supply")
  private double maxSupply;

  private double ath;

  @JsonProperty(value = "ath_change_percentage")
  private double athChangePercentage;

  @JsonProperty(value = "ath_date")
  private LocalDateTime athDate;

  @JsonProperty(value = "atl")
  private double atl;

  @JsonProperty(value = "atl_change_percentage")
  private double atlChangePercentage;

  @JsonProperty(value = "atl_date")
  private LocalDateTime atlDate;

  @JsonProperty(value = "roi")
  private Roi roi;

  @JsonProperty(value = "last_updated")
  private LocalDateTime lastUpdated;

  @Data
  @Builder
  @EqualsAndHashCode
  @ToString
  public static class Roi {

    @JsonProperty(value = "times")
    private double times;

    @JsonProperty(value = "currency")
    private String currency;
    @JsonProperty(value = "percentage")
    private double percentage;
  }

}
