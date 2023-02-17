package com.example.demo;

import java.util.Date;

import org.aspectj.weaver.NewConstructorTypeMunger;
import org.hibernate.dialect.MyISAMStorageEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration.WelcomePageConfiguration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ExpiredScheduler {

	private static final Logger Logger = LoggerFactory.getLogger(ExpiredScheduler.class);
	
	@Scheduled(initialDelay = 10000 , fixedDelay = 20000)
	public void markExpired() {
		Logger.info("Welcome to My page:{}",new Date());
	}
}
