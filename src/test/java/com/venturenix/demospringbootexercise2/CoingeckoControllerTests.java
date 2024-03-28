package com.venturenix.demospringbootexercise2;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import com.venturenix.demospringbootexercise2.controller.impl.CoingeckoController;
import com.venturenix.demospringbootexercise2.model.Coingecko;
import com.venturenix.demospringbootexercise2.service.CoingeckoService;

@WebMvcTest(CoingeckoController.class)
public class CoingeckoControllerTests {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private CoingeckoService coingeckoService;

  @Test
  void testCoingecko() throws Exception {

    Coingecko cko1 = Coingecko.builder().id("bitcoin") //
        .symbol("btc") //
        .name("Bitcoin") //
        .image(
            "https://assets.coingecko.com/coins/images/1/large/bitcoin.png?1696501400") //
        .currentPrice(48119.0) //
        .marketCap(943979075690L) //
        .marketCapRank(1) //
        .fullyDilutedValuation(1010083664413L) //
        .totalVolume(14878964982L) //
        .high24h(48729.0) //
        .low24h(47947.0) //
        .priceChange24h(-91.39385662862333) //
        .priceChangePercentage24h(-0.18957) //
        .marketCapChange24h(-2218967570L) //
        .marketCapChangePercentage24h(0.0) //
        .circulatingSupply(0.0) //
        .totalSupply(21000000) //
        .maxSupply(21000000) //
        .ath(69045.0) //
        .athChangePercentage(-30.35057) //
        .athDate(LocalDateTime.of(2021, 11, 10, 14, 24, 11)) //
        .atl(67.81) //
        .atlChangePercentage(70818.73563) //
        .atlDate(LocalDateTime.of(2013, 07, 06, 00, 00, 00)) //
        .lastUpdated(LocalDateTime.of(2024, 02, 12, 9, 05, 16)) //
        .build();

    // Coingecko cko2 = Coingecko.builder()
    // .id("ethereum") //
    // .symbol("eth") //
    // .name("Ethereum") //
    // .image("https://assets.coingecko.com/coins/images/279/large/ethereum.png?1696501628") //
    // .currentPrice(2489.94) //
    // .marketCap(299318023536L) //
    // .marketCapRank(2) //
    // .fullyDilutedValuation(299318023536L) //
    // .totalVolume(7275066671L) //
    // .high24h(2531.49) //
    // .low24h(2485.33) //
    // .priceChange24h(-39.68281791189611) //
    // .priceChangePercentage24h(-1.56873) //
    // .marketCapChange24h(-4226118606L) //
    // .marketCapChangePercentage24h(0.0) //
    // .circulatingSupply(0.0) //
    // .totalSupply(120169997.442938) //
    // .maxSupply(0) //
    // .ath(4878.26) //
    // .athChangePercentage(-48.94296) //
    // .athDate("2021-11-10T14:24:19.604Z") //
    // .atl(0.432979) //
    // .atlChangePercentage(575146.37857) //
    // .atlDate("2015-10-20T00:00:00.000Z") //
    // .roi(Roi.builder() //
    // .times(68.1911670378185) //
    // .currency("btc") //
    // .percentage(6819.11670378185) //
    // .build())
    // .lastUpdated("2024-02-12T09:05:34.169Z") //
    // .build();



  }

}
