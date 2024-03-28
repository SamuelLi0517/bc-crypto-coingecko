package com.venturenix.demospringbootexercise2.infra;

import org.springframework.web.util.UriComponentsBuilder;

public class BcUtil {

  // public static String url(Scheme scheme, String domin, String endpoint){
  // return UriComponentsBuilder.newInstance() //
  // .scheme(scheme.lowercaseName())//
  // .host(domin) //
  // .path(endpoint) //
  // .toUriString();
  // }

  public static UriComponentsBuilder url(Scheme https, String coingeckoKey,
      String domain, String path, String endpoint, String coinsVsCurrency) {
    return UriComponentsBuilder.newInstance() //
        .scheme(https.lowercaseName())//
        .host(domain)//
        .pathSegment(path.split("/"))//
        .pathSegment(endpoint.split("/"))
        .queryParam("vs_currency", coinsVsCurrency)
        .queryParam("x_cg_demo_api_key", coingeckoKey);

    // }

    // public static UriComponentsBuilder uriBuilder(Scheme scheme,
    // String domain, String path, String endpoint,
    // MultiValueMap<String, String> queryParams, String... pathSegments) {
    // return UriComponentsBuilder.newInstance()//
    // .scheme(scheme.getProtocol())//
    // .host(domain)//
    // .pathSegment(pathSegments)//
    // .path(path)//
    // .path(endpoint)//
    // .queryParams(queryParams);
    // }
  }
}
