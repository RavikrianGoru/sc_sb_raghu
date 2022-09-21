package in.nareshit.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.nareshit.bean.Manager;

public class TestApp2 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		System.out.println("....2....");
		Manager mObj= ac.getBean("mgr", Manager.class);
		System.out.println(mObj+"\n");
		
		ac.close();
	}

}
