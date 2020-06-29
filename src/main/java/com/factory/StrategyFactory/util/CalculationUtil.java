package com.factory.StrategyFactory.util;

import com.factory.StrategyFactory.domain.User;
import com.factory.StrategyFactory.factory.UserPayServiceStrategyFactory;
import com.factory.StrategyFactory.service.UserPayService;

import java.math.BigDecimal;

// context class in strategy pattern
public class CalculationUtil {
    public static BigDecimal calPrice(BigDecimal orderPrice, User user) {
        String vipType = user.getVipType();
        UserPayService strategy = UserPayServiceStrategyFactory.getByUserType(vipType);
        return strategy.quote(orderPrice);
    }
}
