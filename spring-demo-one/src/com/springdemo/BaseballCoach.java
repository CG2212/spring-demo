package com.springdemo;

public class BaseballCoach implements Coach{

	@Override
	public String getDailyWorkout(){
		return "Spend 30 mins on batting practice";
	}
	
	@Override
	public int getDailyWorkout(int timebuffer){
		return timebuffer + 5;
	}
}
