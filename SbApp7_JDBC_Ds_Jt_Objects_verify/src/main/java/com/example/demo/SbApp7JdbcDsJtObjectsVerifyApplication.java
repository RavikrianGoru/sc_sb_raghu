package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbApp7JdbcDsJtObjectsVerifyApplication {

	
	/*
	  PreReq: mysql to be installed.
	  root/root
	  
	  > create database testdb;
	  > use testdb;
	  > CREATE TABLE `testdb`.`emp` (
	    `eid` INT NOT NULL,
	  	`ename` VARCHAR(45) NOT NULL,
  		`esal` DOUBLE NOT NULL,
	  	PRIMARY KEY (`eid`))
		COMMENT = 'sample emp table with eid, ename, esal columns';
	   
	   > select * from emp;
	 */
	public static void main(String[] args) {
		SpringApplication.run(SbApp7JdbcDsJtObjectsVerifyApplication.class, args);
	}

}
