package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.utility.RunnerUtility;

@Configuration
public class AppConfig 
{

	@Bean
	public CommandLineRunner getCLMessageRunner()
	{
		//Anonymous interface
		return new CommandLineRunner() {

			@Value("${spring.app.name}")
			private String name;

			@Override
			public void run(String... args) throws Exception {
				System.out.println("========Anonymous interface========");
				System.out.println(this.getClass().getName()+"-Execution only once.");
				System.out.println("CmdLine args  if any:"+Arrays.asList(args));
				System.out.println("Server Name"+name);
			}
		};
	}
	
	
	@Bean
	public CommandLineRunner getCLGreetingRunner()
	{
		//Lambda Expression
		return (args)->{ 
						System.out.println("========Lambda Expression========");
						System.out.println(this.getClass().getName() + "-Execution only once.");
						System.out.println("CmdLine args  if any:" + Arrays.asList(args));
		};
	}
	
	@Bean
	public CommandLineRunner getCLAdvertiseRunner()
	{
		//Method reference
		System.out.println("========method reference========");
		return RunnerUtility::getCLAdvertiseRunner;
	}
	@Bean
	public ApplicationRunner getAppRunnerMessageRunner()
	{
		//Anonymous interface
		return new ApplicationRunner() {

			@Value("${spring.app.name}")
			private String name;

			@Override
			public void run(ApplicationArguments args) throws Exception {
				System.out.println("========Anonymous interface========");
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
		};
	}
	
	
	@Bean
	public ApplicationRunner getAppRunnerGreetingRunner()
	{
		//Lambda Expression
		return (args)->{ 
						System.out.println("========Lambda Expression========");
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
		};
	}
	
	@Bean
	public ApplicationRunner getApplicationAdvertiseRunner()
	{
		//Method reference
		System.out.println("========method reference========");
		return RunnerUtility::getApplicationAdvertiseRunner;
	}
	
}
