package in.nareshit.rk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.nareshit.rk.bean.Product;

public class AppTest {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("ScConfig.xml");
		Product pObj= ac.getBean("pob", Product.class);
		System.out.println(pObj);
	}

}
