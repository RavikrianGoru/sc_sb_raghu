package in.rk.spring.lookup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.rk.spring.lookup.bean.SingletonBeanTokenMachine;



public class TestApp1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Config.xml");
		
		SingletonBeanTokenMachine obj1=ac.getBean("tokenMachine",SingletonBeanTokenMachine.class);
		System.out.println(obj1);
		System.out.println(obj1.getName());
		obj1.findToken();
		
		SingletonBeanTokenMachine obj2=ac.getBean("tokenMachine",SingletonBeanTokenMachine.class);
		System.out.println(obj1);
		System.out.println(obj1.getName());
		obj1.findToken();

		ac.close();
		
		
	}

}
