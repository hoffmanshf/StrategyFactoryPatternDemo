package com.factory.StrategyFactory.service.impl;

import com.factory.StrategyFactory.factory.UserPayServiceStrategyFactory;
import com.factory.StrategyFactory.service.UserPayService;
import org.springframework.beans.factory.InitializingBean;

import java.math.BigDecimal;

public class VipPayService implements UserPayService, InitializingBean {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        if (orderPrice.compareTo(new BigDecimal("15")) > 0) {
            return orderPrice.multiply(new BigDecimal("0.7"));
        }
        return orderPrice;
    }

    @Override
    public void afterPropertiesSet() {
        UserPayServiceStrategyFactory.register("Vip",this);
    }
}
