package com.wlsite.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class App {
	public static void main(String[] args) {

		new SpringApplicationBuilder(App.class)
				// WebApplicationType 应用的类型
				// NONE: 非web | SERVLET: web | REACTIVE: 响应式编程
				.web(WebApplicationType.SERVLET)
				.run(args);
	}
}
