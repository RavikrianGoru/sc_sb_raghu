package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.beans.Employee;

@SpringBootApplication
public class SbApp2cLoadBulkDataYamlApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext conext = SpringApplication.run(SbApp2cLoadBulkDataYamlApplication.class, args);
		Employee eObj = conext.getBean("empObj", Employee.class);
		System.out.println(eObj);
	}

}
