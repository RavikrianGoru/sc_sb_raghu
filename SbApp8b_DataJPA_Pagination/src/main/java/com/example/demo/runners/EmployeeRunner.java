package com.example.demo.runners;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {

		// Save bulk Records
		saveBuilkRecords();
		
		//List<Employee> allEmps=repo.findAll();
		//System.out.println(allEmps);

		long totalRows=repo.count();
		System.out.println("Total Rows:"+totalRows);
		
		//Total rows 16, try with page 0,3,4
		Pageable pageable=PageRequest.of(0, 5);
		Page<Employee> page0=repo.findAll(pageable);
		
		//metadata
		System.out.println(page0);
		System.out.println("Page number:"+page0.getNumber());
		System.out.println("Page size:"+page0.getSize());
		System.out.println("No of elements in page:"+page0.getNumberOfElements());
		System.out.println("Total no of elements(all rows):"+page0.getTotalElements());
		System.out.println("Total no of pages:"+page0.getTotalPages());
		System.out.println("Has Content:"+page0.hasContent());
		System.out.println("Has Next:"+page0.hasNext());
		System.out.println("Has Preavious:"+page0.hasPrevious());
		System.out.println("Is Empty:"+page0.isEmpty());
		System.out.println("Is First:"+page0.isFirst());
		System.out.println("Is last:"+page0.isLast());
		
		//data
		List<Employee>pageList=page0.getContent();
		pageList.forEach(System.out::println);
		
		
		
	}

	private void saveBuilkRecords()
	{
		
		List<Employee> list=Arrays.asList(new Employee(100,"Aaa",100.00),
				new Employee(101,"Baa",130.00),
				new Employee(102,"Caa",260.00),
				new Employee(103,"Daa",700.00),
				new Employee(104,"Eaa",140.00),
				new Employee(105,"Faa",230.00),
				new Employee(106,"Gaa",340.00),
				new Employee(107,"Haa",120.00),
				new Employee(108,"Iaa",540.00),
				new Employee(109,"Jaa",40.00),
				new Employee(110,"kaa",600.00),
				new Employee(111,"Laa",300.00),
				new Employee(112,"Maa",700.00),
				new Employee(113,"Naa",140.00),
				new Employee(114,"Oaa",105.00),
				new Employee(115,"Paa",103.00)
				);
		repo.saveAll(list);
	}

}
