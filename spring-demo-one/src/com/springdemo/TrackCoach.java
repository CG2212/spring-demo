package com.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 5km daily";
	}

	@Override
	public int getDailyWorkout(int timebuffer){
		return timebuffer + 10;
	}
}
