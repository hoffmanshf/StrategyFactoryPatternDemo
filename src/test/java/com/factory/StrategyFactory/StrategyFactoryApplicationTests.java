package com.factory.StrategyFactory;

import com.factory.StrategyFactory.domain.User;
import com.factory.StrategyFactory.util.CalculationUtil;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class StrategyFactoryApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void sampleTest() {
		User user = new User();
		user.setVipType("ParticularlyVip");
		BigDecimal res = CalculationUtil.calPrice(new BigDecimal("50"), user);
		Assert.assertThat(res, Matchers.comparesEqualTo(new BigDecimal("35")));
	}

}
