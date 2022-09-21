package com.example.demo.bean;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component("tokenService")
@Scope("prototype")
@ToString
public class TokenService {
	
	private String token;
	
	public TokenService()
	{
		System.out.println("TokenService object is created");
		token=String.valueOf(new Random().nextInt(1000));
	}

}
