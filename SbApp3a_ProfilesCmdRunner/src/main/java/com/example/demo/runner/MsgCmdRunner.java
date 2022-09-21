package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component("msgcmdrunner")
public class MsgCmdRunner implements CommandLineRunner {

	@Value("${my.app.db}")
	private String db;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(db);
	}

}
