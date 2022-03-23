package com.testyantra.jenkin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
 class SpringBootJenkinApplicationTests {

	public static final Logger LOGGER = LoggerFactory.getLogger(SpringBootJenkinApplicationTests.class);

	@Test
	 void contextLoads() {
		LOGGER.info("Test Cases Started....");
		LOGGER.info("Test Cases Started second Commit....");
		assertEquals(true, true);
	}

}