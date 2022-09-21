package in.rk.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.rk.spring.bean.DbConnection;
import in.rk.spring.bean.MsgService;
import in.rk.spring.bean.TokenService;

public class AppTest {

	public static void main(String[] args) {

		ApplicationContext con=new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Spring Context or Container is created.");
		
		DbConnection d1=con.getBean("dbConnection",DbConnection.class);
		DbConnection d2=con.getBean("dbConnection",DbConnection.class);
		DbConnection d3=con.getBean("dbConnection",DbConnection.class);
		System.out.println(d1+"---->"+d1.hashCode());
		System.out.println(d2+"---->"+d2.hashCode());
		System.out.println(d3+"---->"+d3.hashCode());
	
		MsgService m1 = con.getBean("msgService",MsgService.class);
		MsgService m2 = con.getBean("msgService",MsgService.class);
		MsgService m3 = con.getBean("msgService",MsgService.class);
		System.out.println(m1+"---->"+m1.hashCode());
		System.out.println(m2+"---->"+m2.hashCode());
		System.out.println(m3+"---->"+m3.hashCode());
		
		TokenService t1=con.getBean("tokenService", TokenService.class);
		TokenService t2=con.getBean("tokenService", TokenService.class);
		TokenService t3=con.getBean("tokenService", TokenService.class);
		System.out.println(t1+"----"+t1.hashCode());
		System.out.println(t2+"----"+t2.hashCode());
		System.out.println(t3+"----"+t3.hashCode());
	}

}
