package com.cognixia.jumpplus;

public class MyApp {

	public static void main(String[] args) {
		// create the obj
		Coach theCoach = new BaseballCoach();
		
		//use the obj
		System.out.println(theCoach.getDailyWorkout());
	}

}
