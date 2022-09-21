package in.nareshit.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.nareshit.bean.EmpService;
import in.nareshit.config.AppConfig;

public class AppTest1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmpService es=ac.getBean("empService",EmpService.class);
		System.out.println(es);

		ac.close();
	}

}
