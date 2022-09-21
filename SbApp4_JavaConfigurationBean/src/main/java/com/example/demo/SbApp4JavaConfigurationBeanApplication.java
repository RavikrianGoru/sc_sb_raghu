package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.info.JavaInfo;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbApp4JavaConfigurationBeanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SbApp4JavaConfigurationBeanApplication.class, args);
		JavaInfo obj=context.getBean("javaInfoObj",JavaInfo.class);
		System.out.println("Java version:"+obj.getVersion());
	}

}
