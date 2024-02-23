package com.venturenix.demospringbootexercise2.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.venturenix.demospringbootexercise2.infra.RedisHelper;

@Configuration
public class AppConfig {
  
  @Bean
  RestTemplate restTemplate(){
    return new RestTemplate();
  }

  @Bean
   ModelMapper modelMapper(){
    return new ModelMapper();
   }

    @Bean
  RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory,
      ObjectMapper objectMapper) {
    RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();
    redisTemplate.setConnectionFactory(factory);
    redisTemplate.setKeySerializer(RedisSerializer.string());
    redisTemplate.setValueSerializer(RedisSerializer.json());
    redisTemplate.afterPropertiesSet();
    // Jackson2JsonRedisSerializer<Object> serializer =
    // new Jackson2JsonRedisSerializer<>(objectMapper, Object.class);
    // redisTemplate.setValueSerializer(serializer);
    return redisTemplate;
  }

  @Bean
  RedisHelper redisHelper(RedisConnectionFactory factory,
      ObjectMapper objectMapper) {
    return new RedisHelper(factory, objectMapper);
  }

  @Bean
  ObjectMapper objectMapper() {
    return new ObjectMapper();
  }


}
