package com.venturenix.demospringbootexercise2.model;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Builder
@Data
public class CoingeckoDTO {
  private String id;// Bitcoin
  private String symbol;// "btc"
  private String name;
  private String image;

  @JsonProperty("current_price")
  private double currentPrice;

  @JsonProperty("market_cap")
  private long marketCap;

  @JsonProperty("market_cap_rank")
  private int marketCapRank;

  @JsonProperty("fully_diluted_valuation")
  private long fullyDilutedValuation;

  @JsonProperty("total_volume")
  private long totalVolume;

  @JsonProperty("high_24h")
  private double high24h;

  @JsonProperty("low_24")
  private double low24h;

  @JsonProperty("price_change_24h")
  private double priceChange24h;

  @JsonProperty("price_change_percent_24h")
  private double priceChangePercentage24h;

  @JsonProperty("market_cap_change_24h")
  private double marketCapChange24h;

  @JsonProperty("market_cap_change_percentage_24h")
  private double marketCapChangePercentage24h;

  @JsonProperty("circulating_supply")
  private double circulatingSupply;

  @JsonProperty("total_supply")
  private double totalSupply;

  @JsonProperty("max_supply")
  private double maxSupply;

  private double ath;

  @JsonProperty("ath_change_percentage")
  private double athChangePercentage;

  @JsonProperty("ath_date")
  private LocalDateTime athDate;

  private double atl;

  @JsonProperty("atl_change_percentage")
  private double atlChangePercentage;

  @JsonProperty("atl_dte")
  private LocalDateTime atlDate;

  private Roi roi;

  @JsonProperty("last_updated")
  private String lastUpdated;

  @Data
  @Builder
  @EqualsAndHashCode
  @ToString
  public static class Roi {

    private double times;

    private String currency;

    private double percentage;
  }

}
