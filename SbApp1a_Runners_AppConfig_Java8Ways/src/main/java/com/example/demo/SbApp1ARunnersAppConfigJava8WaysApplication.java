package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbApp1ARunnersAppConfigJava8WaysApplication {

	//cmdArgs
	//code test deploy --port=8989 --code=ORCL --loc=abc --loc=mno --spring.app.name=FROM_CMD_ARGs
	public static void main(String[] args) {
		System.out.println("App-execution-started");
		SpringApplication.run(SbApp1ARunnersAppConfigJava8WaysApplication.class, args);
		System.out.println("App-execution-completed");
	}

}
