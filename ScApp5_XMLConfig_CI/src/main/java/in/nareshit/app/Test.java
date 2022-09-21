package in.nareshit.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.nareshit.bean.Employee;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
	
	Employee eObj= ac.getBean("emp", Employee.class);
	System.out.println(eObj);

	Employee eObj2= ac.getBean("emp2", Employee.class);
	System.out.println(eObj2);
	
	ac.close();
}
}
