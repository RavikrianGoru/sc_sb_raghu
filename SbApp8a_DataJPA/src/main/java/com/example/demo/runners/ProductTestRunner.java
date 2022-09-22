package com.example.demo.runners;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Component
public class ProductTestRunner implements CommandLineRunner {

	@Autowired
	ProductRepository prodRepo;

	@Override
	public void run(String... args) throws Exception 
	{
		
		//1. save(-): each call one network call
		prodRepo.save(new Product(101,"Cup",150.00));//insert as obj not exist
		prodRepo.save(new Product(102,"Jar",160.00));//insert as obj not exist
		prodRepo.save(new Product(102,"Cup & Jar",3000.00));//update as obj already exist

		//2. saveAndFlush(-): saves and returns saved object
		Product p= prodRepo.saveAndFlush(new Product(101,"Cup",150.00));//insert as obj not exist
		System.out.println(p);
		
		//3. saveAll(-): single n/w call to insert/update all objects.
		prodRepo.saveAll(
				Arrays.asList(new Product(103,"Pen",25.00),new Product(104,"Pencil",15.00))
				);
		//4. saveAll(-): single n/w call to insert/update all objects.
		List<Product> products=prodRepo.saveAllAndFlush(
				Arrays.asList(new Product(103,"10 Pens",250.00),new Product(105,"Pencils",15.00))
				);
		System.out.println(products);
	
		//5. count():long
		long count=prodRepo.count();
		System.out.println(count);
		
		//6. delete(-):void
		prodRepo.delete(new Product(103,"10 Pens",250.00));
		
		//7. deleteById(-):void
		prodRepo.deleteById(105);
		
		//8. existsById(-):boolean
		boolean isExist=prodRepo.existsById(105);
		System.out.println(isExist);
		
		//9. findById(-):Optional<T>
		Optional<Product> opt=prodRepo.findById(101);
		if(opt.isPresent())
		{
			System.out.println(opt.get());
		}else
			System.out.println("Data not found for 101");
		
		//10. findAll():List<T>
		System.out.println("----- all products -----");
		List<Product> allProducts=prodRepo.findAll();
		allProducts.forEach(System.out::println);
		
		
	}

}
