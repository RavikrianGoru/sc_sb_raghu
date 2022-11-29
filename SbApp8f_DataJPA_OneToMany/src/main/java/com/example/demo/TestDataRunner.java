package com.example.demo;


import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.CarCompany;
import com.example.demo.entity.CarModel;
import com.example.demo.repo.CarCompanyRepository;
import com.example.demo.repo.CarModlRepository;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private CarCompanyRepository ccRepo;
	
	@Autowired
	private CarModlRepository cmRepo;
	
	@Override
	public void run(String... args) throws Exception {

		
		CarModel cm1= new CarModel(1001, "Ertiga", new Date(1980, 0, 1), 400000.00);
		CarModel cm2= new CarModel(1002, "Brezza", new Date(1990, 0, 1), 500000.00);
		CarModel cm3= new CarModel(1003, "Alto", new Date(2000, 0, 1), 600000.00);
		cmRepo.save(cm1);
		cmRepo.save(cm2);
		cmRepo.save(cm3);
		
		Set<CarModel> mModels=new HashSet<>();
		mModels.add(cm1);
		mModels.add(cm2);
		mModels.add(cm3);
		CarCompany cc1= new CarCompany(201, "Maruti", "JPN", LocalDate.of(1980, 1, 2), mModels);
		ccRepo.save(cc1);
		
	}

}
