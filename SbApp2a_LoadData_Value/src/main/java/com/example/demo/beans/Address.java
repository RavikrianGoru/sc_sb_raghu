package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
public class Address {
	
	@Value("8-1-67")
	private String hno;

	@Value("${my.app.emp.addr.pin:100001}")
	private String pin;

}
