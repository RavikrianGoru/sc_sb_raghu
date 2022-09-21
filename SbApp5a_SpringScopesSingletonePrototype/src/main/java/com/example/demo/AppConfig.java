package com.example.demo;

import org.springframework.boot.info.JavaInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean
	@Scope("singleton")
	public JavaInfo javaInfoObj()
	{
		JavaInfo obj= new JavaInfo();
		return obj;
	}
	
	@Bean
	@Scope("prototype")
	public JavaInfo javaInfoObjProto()
	{
		JavaInfo obj= new JavaInfo();
		return obj;
	}

}
