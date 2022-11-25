package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Student;
import com.example.demo.entities.enums.Vehicle;
import com.example.demo.repo.StudentReository;

@Component
public class StudentRunner implements CommandLineRunner {

	@Autowired
	private StudentReository repo;
	
	@Override
	public void run(String... args) throws Exception {

		
		Student s1= new Student(1001, "Raj", LocalDate.now(), LocalDateTime.now(), Vehicle.CAR);
		repo.save(s1);
		
		System.out.println("From DB :"+repo.findById(1001));
		
	}

}
