package in.nareshit.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.nareshit.beans.blocks.Department;
import in.nareshit.beans.staff.Employee;


public class AppTest1 {

	public static void main(String[] args) 
	{
		
		//1. Create Spring Container Reference obj
		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext();
		
		//2. Scan spring bean classes from specified package[s]
		config.scan("in.nareshit.beans.staff", "in.nareshit.beans.blocks");
		
		//3. Refresh - create objects, provide data, links object.
		config.refresh();
		
		//4 . Read objects 
		Employee eObj = config.getBean("empObj", Employee.class);
		Department dObj = config.getBean("depObj", Department.class);

		//5. Print Objects
		System.out.println(eObj +"----"+dObj);
		
		//6. Close Container
		config.close();
	}

}
