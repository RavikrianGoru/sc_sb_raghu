package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix="my.app.emp.addr")
public class Address {
	
	@Value("8-1-67")
	private String hno;

	private String pin;

}
