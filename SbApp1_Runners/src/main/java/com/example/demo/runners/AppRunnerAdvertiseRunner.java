package com.example.demo.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(55)
public class AppRunnerAdvertiseRunner implements ApplicationRunner {

	@Value("${spring.app.name}")
	private String name;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(this.getClass().getName()+"-Execution only once.");
		System.out.println("AppRunner args  if any:"+Arrays.asList(args));
		
		System.out.println("NonOptionArgs:---->"+args.getNonOptionArgs());
		System.out.println("OptionArgs:---->");
		for(String each:args.getOptionNames())
		{
			System.out.println(each+" ===> "+args.getOptionValues(each));
		}
		if(args.containsOption("port"))
		{
			System.out.println("Server port="+args.getOptionValues("port"));
		}
		
		System.out.println("Server Name"+name);

	}

}
