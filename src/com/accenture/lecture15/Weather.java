package com.accenture.lecture15;

import java.util.Arrays;

public class Weather {
	final String country;
	private int[] daysWeather;
	
	public String getCountry() {
		return this.country;
	}
	public int[] getDaysWeather() {
		return daysWeather;
	}
	public void setDaysWeather(int[] daysWeather) {
		this.daysWeather = daysWeather;
	}
	public Weather(String country, int[] daysWeather) {
		this.country = country;
		this.daysWeather = daysWeather;
	}
	public String toString(){
		return "Weather forecast for " + country + " next days " + daysWeather.toString();
	}
	
}


