package com.example.demo.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(6)
public class CmdRunnerGreetingRunner implements CommandLineRunner {

	@Value("${spring.app.name}")
	private String name;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.getClass().getName() + "-Execution only once.");
		System.out.println("CmdLine args  if any:" + Arrays.asList(args));
		System.out.println("Server Name"+name);
	}

}
