package com.wlsite.config;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomApplicationListener implements ApplicationListener {
	public void onApplicationEvent(ApplicationEvent applicationEvent) {
		System.out.println("###CustomApplicationListener###");
	}
}