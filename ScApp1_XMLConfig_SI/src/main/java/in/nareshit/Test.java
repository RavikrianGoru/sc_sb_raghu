package in.nareshit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml","SpringConfig2.xml");
		Object dbObj= ac.getBean("dbcon");
		System.out.println(dbObj);
		Object empObj= ac.getBean("emp");
		System.out.println(empObj);
		
	}
}
