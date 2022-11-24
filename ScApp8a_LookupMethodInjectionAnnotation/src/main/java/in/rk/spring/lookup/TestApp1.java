package in.rk.spring.lookup;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.rk.spring.lookup.bean.ChildProtoTypeToken;
import in.rk.spring.lookup.bean.ParentSingletonTokenMachine;

public class TestApp1 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext(AppConfig.class);
		ChildProtoTypeToken obj1C1=ac.getBean("childProtoTypeToken",ChildProtoTypeToken.class);
		System.out.println(obj1C1);
		System.out.println(obj1C1.getName());
		obj1C1.displyToke();

		ParentSingletonTokenMachine objP1= ac.getBean("parentSingletonTokenMachine",ParentSingletonTokenMachine.class);
		System.out.println(objP1.getChildProtoTypeToken());
		System.out.println(objP1.getChildProtoTypeToken().getName());
		objP1.getChildProtoTypeToken().displyToke();
		objP1.findToken();
		
		
	}

}
