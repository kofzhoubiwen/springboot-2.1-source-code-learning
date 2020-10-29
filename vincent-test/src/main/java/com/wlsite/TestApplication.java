package com.wlsite;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TestApplication {
	public static void main(String[] args) {
		// 启动方式1
		SpringApplication.run(TestApplication.class);

		// 启动方式2
//		new SpringApplicationBuilder().web(WebApplicationType.SERVLET).profiles("dev").run(args);
	}
}
