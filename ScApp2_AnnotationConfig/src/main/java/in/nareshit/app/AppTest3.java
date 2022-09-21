package in.nareshit.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.nareshit.app.config.AppConfig;
import in.nareshit.beans.staff.Database;


public class AppTest3 {

	public static void main(String[] args) 
	{
		
		//1. Create Spring Container with AppConfig :Reference obj
		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//2 . Read objects 
		Database dbObj = config.getBean("database", Database.class);

		//3. Print Objects
		System.out.println(dbObj);
		
		//4. Close Container
		config.close();
	}

}
