package com.springdemo;

public class BaseballCoach implements Coach{
	// define a private filed for the the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 mins on batting practice";
	}
	
	// define a method overloading for getDailyWorkout method
	@Override
	public int getDailyWorkout(int timebuffer){
		return timebuffer + 5;
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
