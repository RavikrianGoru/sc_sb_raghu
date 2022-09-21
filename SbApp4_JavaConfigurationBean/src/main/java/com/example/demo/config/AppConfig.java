package com.example.demo.config;

import org.springframework.boot.info.JavaInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	
	@Bean
	public JavaInfo javaInfoObj()
	{
		return new JavaInfo();
	}
}
