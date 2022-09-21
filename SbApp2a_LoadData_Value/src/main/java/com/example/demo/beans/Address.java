package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Address {
	
	@Value("8-1-67")
	private String hno;

	@Value("${my.app.emp.addr.pin:100001}")
	private String pin;

}
