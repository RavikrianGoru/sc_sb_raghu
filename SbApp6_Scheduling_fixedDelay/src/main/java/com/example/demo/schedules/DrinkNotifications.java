package com.example.demo.schedules;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DrinkNotifications 
{
	
	//@Scheduled(fixedDelay = 5 * 60 * 1000 ) //5 mins
	@Scheduled(fixedDelay = 2000 ) // 2secs
	public void drink()
	{
		System.out.println("Drink a sip of water at "+new Date());
	}
	
	//@Scheduled(fixedRate = 2 * 60 * 60 * 1000)//2 hrs
	@Scheduled(fixedRate = 5000)// 5 secs
	public void drinkTea()
	{
		System.out.println("Drink a cup of tea at "+new Date());
	}
	
	//@Scheduled(cron = "0 0 20 * * SUN") //Every Sunday 8:00:00 PM
	@Scheduled(cron = "10 * * * * *")
	public void drinkAlcohol()
	{
		System.out.println("Drink 30ml of Alcoho at "+LocalDateTime.now());
	}

	//@Scheduled(cron = "*/10 * * * * *")
	//@Scheduled(cron = "0 28 18 * 9 *")
	//@Scheduled(cron = "@monthly")
	//@Scheduled(cron = "@weekly")
	@Scheduled(cron = "0 0 9 1 MAR FRI,SUN")
	public void drinkSoup()
	{
		System.out.println("Drink Soup at "+LocalDateTime.now());
	}
}
