package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.beans.Employee;

@SpringBootApplication
public class SbApp2aLoadDataValueApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext conext=SpringApplication.run(SbApp2aLoadDataValueApplication.class, args);
		Employee eObj=conext.getBean("empObj",Employee.class);
		System.out.println(eObj);
	}

}
