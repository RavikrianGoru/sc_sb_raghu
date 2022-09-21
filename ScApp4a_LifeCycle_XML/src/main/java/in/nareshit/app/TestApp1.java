package in.nareshit.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.nareshit.bean.Employee;

public class TestApp1 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
		

		System.out.println("....1....");
		Employee eObj= ac.getBean("emp", Employee.class);
		System.out.println(eObj+"\n");
		
		ac.close();
	}

}
