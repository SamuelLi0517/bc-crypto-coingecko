package com.venturenix.demospringbootexercise2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.venturenix.demospringbootexercise2.entity.CoingeckoEntity;

public interface CoingeckoRepo extends JpaRepository<CoingeckoEntity, Long>{

  
}
