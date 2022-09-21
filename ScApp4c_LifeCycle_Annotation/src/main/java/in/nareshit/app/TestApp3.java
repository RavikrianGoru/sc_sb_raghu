package in.nareshit.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.nareshit.bean.Owner;
import in.nareshit.config.AppConfig;

public class TestApp3 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("\n....3....");
		Owner oObj= ac.getBean("owr", Owner.class);
		System.out.println(oObj+"\n");
		
		ac.close();
	}

}
