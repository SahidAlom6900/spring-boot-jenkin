package com.testyantra.jenkin;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringBootJenkinApplication {
	
	public static final Logger LOGGER=LoggerFactory.getLogger(SpringBootJenkinApplication.class);
	
	@PostConstruct
	public void init() {
		LOGGER.info("Application Started....");
	}

	public static void main(String[] args) {
		LOGGER.info("Application Executed in jenkin Branch....");
		SpringApplication.run(SpringBootJenkinApplication.class, args);
	}

}
