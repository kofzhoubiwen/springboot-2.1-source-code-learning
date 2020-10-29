package com.wlsite.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CustomApplicationContextInitializer implements ApplicationContextInitializer {
	public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
		System.out.println("###CustomApplicationContextInitializer###");
	}
}
