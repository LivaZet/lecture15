package com.accenture.lecture15;

import java.util.Arrays;

public class Weather {
	private final String country;
	private int[] daysWeather;

	// private static String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday",
	// "Thursday", "Friday", "Saturday", "Sunday" };

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

	public String toString() {
		return "Weather forecast for " + country + " next days "
				+ Arrays.toString(getDaysWeather());
	}

	public double getWeekAverage() {
		double average = 0;
		int sum = 0;
		for (int i = 0; i < daysWeather.length; i++) {
			sum = sum + daysWeather[i];
			average = sum / (double) daysWeather.length;
		}
		return average;
	}

	public String getHottestDayName() {
		return getDayName(getHottestDay());
	}

	public int getColdestTemperature() {
		return this.daysWeather[getColdestDay()];
	}

	public String getColdestDayName() {
		return getDayName(getColdestDay());
	}

	public int getHottestTemperature() {
		return this.daysWeather[getHottestDay()];
	}

	private int getHottestDay() {
		int max = daysWeather[0];
		int index = 0;
		for (int i = 0; i < daysWeather.length; i++) {
			if (daysWeather[i] > max) {
				max = daysWeather[i];
				index = i;
			}
		}
		return index;
	}

	private int getColdestDay() {
		int min = daysWeather[0];
		int index = 0;
		for (int i = 0; i < daysWeather.length; i++) {
			if (daysWeather[i] < min) {
				min = daysWeather[i];
				index = i;
			}
		}
		return index;
	}

	private String getDayName(int index) {
		String dayName;
		switch (index + 1) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "error";
		}
		return dayName;
	}

	public void printAdvancedInformation() {
		System.out.println("In " + country
				+ " during next 7 day will be following weather "
				+ Arrays.toString(getDaysWeather()) + "\n"
				+ "the highest temperature will be on " + getHottestDayName()
				+ " " + getHottestTemperature() + " degrees;" + "\n"
				+ "the lowest temperature will be on " + getColdestDayName()
				+ " " + getColdestTemperature() + " degrees.");
	}

	public void applyWarmCycloneEffect() {
		int i;
		for (i = 0; i < daysWeather.length; i++) {
			daysWeather[i] = daysWeather[i] + 1;
		}
	}
	
	public static double celsiusToFahrenheit(double celsiusTemperature) {
		double fahrenheitTemperature = (celsiusTemperature * 1.8) + 32;
		return fahrenheitTemperature;
	}
}
