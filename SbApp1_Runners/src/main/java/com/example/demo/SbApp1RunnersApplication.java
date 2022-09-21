package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbApp1RunnersApplication {

	//cmdArgs
	//code test deploy --port=8989 --code=ORCL --loc=abc --loc=mno --spring.app.name=FROM_CMD_ARGs

	public static void main(String[] args) {
		System.out.println("Application started-before run(-) execution");
		SpringApplication.run(SbApp1RunnersApplication.class, args);
		System.out.println("Application ended-after run(-) execution");
	}

}
