package in.nareshit.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.nareshit.beans.Address;
import in.nareshit.beans.Employee;
import in.nareshit.config.AppConfig;

public class AppTest1 {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext(AppConfig.class);
		Employee empObj= ac.getBean("emp", Employee.class);
		Address addrObj=ac.getBean("address",Address.class);
		
		System.out.println(empObj);
		System.out.println(addrObj);
		
		
		ac.close();
	}
}
