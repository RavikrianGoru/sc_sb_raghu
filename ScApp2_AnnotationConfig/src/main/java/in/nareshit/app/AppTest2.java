package in.nareshit.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.nareshit.app.config.AppConfig;
import in.nareshit.beans.blocks.Department;
import in.nareshit.beans.staff.Employee;


public class AppTest2 {

	public static void main(String[] args) 
	{
		
		//1. Create Spring Container with AppConfig :Reference obj
		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//2 . Read objects 
		Employee eObj = config.getBean("empObj", Employee.class);
		Department dObj = config.getBean("depObj", Department.class);

		//3. Print Objects
		System.out.println(eObj +"----"+dObj);
		
		//4. Close Container
		config.close();
	}

}
