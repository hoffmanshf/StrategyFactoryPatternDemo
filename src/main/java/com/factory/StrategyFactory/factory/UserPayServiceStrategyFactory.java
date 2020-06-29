package com.factory.StrategyFactory.factory;

import com.factory.StrategyFactory.service.UserPayService;
import org.springframework.util.Assert;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserPayServiceStrategyFactory {
    private static Map<String, UserPayService> services = new ConcurrentHashMap<String, UserPayService>();

    public static UserPayService getByUserType(String type) {
        return services.get(type);
    }

    public static void register(String userType, UserPayService userPayService) {
        Assert.notNull(userType, "userType can't be null");
        services.put(userType, userPayService);
    }
}
