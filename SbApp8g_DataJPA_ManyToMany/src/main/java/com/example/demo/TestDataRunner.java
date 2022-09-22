package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Cource;
import com.example.demo.entity.Student;
import com.example.demo.repo.CourceRepository;
import com.example.demo.repo.StudentRepsitory;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private StudentRepsitory sRepo;
	
	@Autowired
	private CourceRepository cRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Cource c1= new Cource(101,"C++", 3000.00);
		Cource c2= new Cource(102,"Java", 3500.00);
		Cource c3= new Cource(103,".Net", 3200.00);
		Cource c4= new Cource(104,"Orcl", 1000.00);

		cRepo.save(c1);
		cRepo.save(c2);
		cRepo.save(c3);
		cRepo.save(c4);
		
		Set<Cource> hs1=new HashSet<>();
		hs1.add(c1);
		hs1.add(c2);
		
		Set<Cource> hs2=new HashSet<>();
		hs2.add(c3);
		hs2.add(c2);

		Set<Cource> hs3=new HashSet<>();
		hs3.add(c3);
		hs3.add(c1);

		Student s1=new Student(1001,"ravi",hs1);
		Student s2=new Student(1002,"kiran",hs2);
		Student s3=new Student(1003,"Chinna",hs3);
		
		sRepo.save(s1);
		sRepo.save(s2);
		sRepo.save(s3);
	}

}
