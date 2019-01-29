package com.grv.microservices.currencyexchangeservice.repository;

import com.grv.microservices.currencyexchangeservice.bean.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{

    /**
     * Find by from and to values
     *
     * returns ExchangeValue
     */
    ExchangeValue findByFromAndTo(String from, String to);

}
