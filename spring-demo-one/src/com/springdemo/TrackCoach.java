package com.springdemo;

public class TrackCoach implements Coach {
	
	// define a private filed for the the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public TrackCoach() {}

	// define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Your Track coach says : Run 5km daily";
	}

	@Override
	public int getDailyWorkout(int timebuffer){
		return timebuffer + 10;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
