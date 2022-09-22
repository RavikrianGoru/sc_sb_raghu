package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Branch;
import com.example.demo.repo.AdminRepository;
import com.example.demo.repo.BranchRepository;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private AdminRepository aRepo;
	
	@Autowired
	private BranchRepository bRepo;
	
	@Override
	public void run(String... args) throws Exception {

		Admin a1= new Admin(1,"Raju","Acounts");
		Admin a2= new Admin(2,"Ram","English");
		Admin a3= new Admin(3,"Chinna","Computer");
		Admin a4= new Admin(4,"Ravi","Maths");
		aRepo.save(a1);
		aRepo.save(a2);
		aRepo.save(a3);
		aRepo.save(a4);
		
		Branch b1= new Branch(1001, "B1",a1);
		Branch b2= new Branch(1002, "B2",a2);
		Branch b3= new Branch(1003, "B3",a3);
		Branch b4= new Branch(1004, "B4",a4);
		bRepo.save(b1);
		bRepo.save(b2);
		bRepo.save(b3);
		bRepo.save(b4);
		
		
	}

}
