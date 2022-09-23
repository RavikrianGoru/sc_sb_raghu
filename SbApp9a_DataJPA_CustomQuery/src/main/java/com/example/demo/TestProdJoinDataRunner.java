package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.ProdDetail;
import com.example.demo.entity.Product;
import com.example.demo.repo.ProdDetailRepository;
import com.example.demo.repo.ProductRepository;

@Component
public class TestProdJoinDataRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository prodRepo;

	@Autowired
	private ProdDetailRepository prodDetailRepo;

	@Override
	public void run(String... args) throws Exception {

		// store data
		prodRepo.save(new Product(101, "P001"));
		prodRepo.save(new Product(102, "P003"));
		prodRepo.save(new Product(103, "P003"));
		prodRepo.save(new Product(104, "P001"));
		prodRepo.save(new Product(105, "P005"));
		prodDetailRepo.save(new ProdDetail("P001", "Apple", 20.00));
		prodDetailRepo.save(new ProdDetail("P003", "Banana", 10.00));
		prodDetailRepo.save(new ProdDetail("P004", "Anar", 30.00));

		prodRepo.getDataInnerJoin().stream().map(obj -> obj[0] + "-" + obj[1] + "-" + obj[2])
				.forEach(System.out::println);

		prodRepo.getDataLeftOuterJoin().stream().map(obj -> obj[0] + "-" + obj[1] + "-" + obj[2])
				.forEach(System.out::println);

		prodRepo.getDataRightOuterJoin().stream().map(obj -> obj[0] + "-" + obj[1] + "-" + obj[2])
				.forEach(System.out::println);

		//prodRepo.getDataFullOuterJoin().stream().map(obj -> obj[0] + "-" + obj[1] + "-" + obj[2])
		//		.forEach(System.out::println);

	}

}
