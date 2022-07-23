package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach thecoach = context.getBean("myCoach" , Coach.class);
		// call methods on the bean
		System.out.println(thecoach.getDailyWorkout());
		System.out.println("Time laps in seconds : " + thecoach.getDailyWorkout(25));
		System.out.println("Daily fortune is : " + thecoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
