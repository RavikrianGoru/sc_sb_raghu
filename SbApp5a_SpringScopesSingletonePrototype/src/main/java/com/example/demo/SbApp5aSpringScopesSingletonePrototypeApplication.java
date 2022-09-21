package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.info.JavaInfo;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.bean.DataBaseConnection;
import com.example.demo.bean.TokenService;

@SpringBootApplication
public class SbApp5aSpringScopesSingletonePrototypeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SbApp5aSpringScopesSingletonePrototypeApplication.class, args);
		System.out.println("Spring Container is created");
		
		//singleton
		DataBaseConnection  db1=context.getBean("dataBaseConnection",DataBaseConnection.class);
		DataBaseConnection  db2=context.getBean("dataBaseConnection",DataBaseConnection.class);
		DataBaseConnection  db3=context.getBean("dataBaseConnection",DataBaseConnection.class);
		System.out.println(db1+"===="+db1.hashCode());
		System.out.println(db2+"===="+db2.hashCode());
		System.out.println(db3+"===="+db3.hashCode());
		
		//prototype
		TokenService t1=context.getBean("tokenService", TokenService.class);
		TokenService t2=context.getBean("tokenService", TokenService.class);
		TokenService t3=context.getBean("tokenService", TokenService.class);
		System.out.println(t1+"===="+t1.hashCode());
		System.out.println(t2+"===="+t2.hashCode());
		System.out.println(t3+"===="+t3.hashCode());

		System.out.println("Spring Java based configuration");
		//singleton
		JavaInfo j1= context.getBean("javaInfoObj", JavaInfo.class);
		JavaInfo j2= context.getBean("javaInfoObj", JavaInfo.class);
		JavaInfo j3= context.getBean("javaInfoObj", JavaInfo.class);
		System.out.println(j1.hashCode()+"--->"+j1.getVersion());
		System.out.println(j2.hashCode()+"--->"+j2.getVersion());
		System.out.println(j3.hashCode()+"--->"+j3.getVersion());

		//prototype
		JavaInfo jp1= context.getBean("javaInfoObjProto", JavaInfo.class);
		JavaInfo jp2= context.getBean("javaInfoObjProto", JavaInfo.class);
		JavaInfo jp3= context.getBean("javaInfoObjProto", JavaInfo.class);
		System.out.println(j1.hashCode()+"--->"+jp1.getVersion());
		System.out.println(j2.hashCode()+"--->"+jp2.getVersion());
		System.out.println(j3.hashCode()+"--->"+jp3.getVersion());

	}

}
