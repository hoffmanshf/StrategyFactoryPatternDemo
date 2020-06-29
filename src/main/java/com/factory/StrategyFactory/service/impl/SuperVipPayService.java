package com.factory.StrategyFactory.service.impl;

import com.factory.StrategyFactory.factory.UserPayServiceStrategyFactory;
import com.factory.StrategyFactory.service.UserPayService;
import org.springframework.beans.factory.InitializingBean;

import java.math.BigDecimal;

public class SuperVipPayService implements UserPayService, InitializingBean {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        return orderPrice.multiply(new BigDecimal("0.8"));
    }

    @Override
    public void afterPropertiesSet() {
        UserPayServiceStrategyFactory.register("SuperVip",this);
    }
}
