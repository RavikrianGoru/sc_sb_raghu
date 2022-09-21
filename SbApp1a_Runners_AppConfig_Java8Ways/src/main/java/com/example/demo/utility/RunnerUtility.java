package com.example.demo.utility;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;

public class RunnerUtility {

		public static void getCLAdvertiseRunner(String... data )
		{
				System.out.println("RunnerUtility.getCLAdvertiseRunner()--Execution only once.");
				System.out.println("CmdLine args  if any:" + Arrays.asList(data));
		}
		
		
		public static void getApplicationAdvertiseRunner(ApplicationArguments args)
		{
			System.out.println("RunnerUtility.getApplicationAdvertiseRunner()--Execution only once.");
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
			
		}
}
