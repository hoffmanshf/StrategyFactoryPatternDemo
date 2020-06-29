package com.factory.StrategyFactory.service;

import java.math.BigDecimal;

public interface UserPayService {
    BigDecimal quote(BigDecimal orderPrice);
}
