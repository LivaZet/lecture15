package com.accenture.lecture15;

import java.util.Arrays;

public class ObjectPractice {

	public static void main(String[] args) {

		// Task 1 - Lets make our Weather class store the following information:
		// String country - for which forecast is prepared.
		// int[] daysWeather- temperature information for the next week (7 days).

		// Task 2 - We should be able to create a new object of the class Weather by
		// passing both field values.
		// Create a constructor in Weather class public Weather(String country , int[] daysWeater)

		// Task 3 - We should prohibit reassigning country field value for weather objects
		// Make it final

		// Task 4 - Lets create few weather forecasts for the following countries/cities:
		// Latvia, Antaliya, Bergen
		// Example:
		Weather latvia = new Weather("Latvia", new int[] { -2, 0, 5, 2, 6, -1, 0 });
		Weather turkey = new Weather("Antaliya", new int[] { 15, 20, 36, 22, 28, -31, 29 });
		Weather norway = new Weather("Bergen", new int[] { -5, -10, -4, 0, 3, -2, 1 });

		// Task 5 - We should prohibit direct access to Weather object fields
		// Make those fields private
		// Create getters for them
		// Output: Latvia [-2, 0, 5, 2, 6, -1, 0]
		 System.out.println(latvia.getCountry() + " " + Arrays.toString(latvia.getDaysWeather()));
		 System.out.println(turkey.getCountry() + " " + Arrays.toString(turkey.getDaysWeather()));
		 System.out.println(norway.getCountry() + " " + Arrays.toString(norway.getDaysWeather()));

		// Task 6 - User should be able to get weather information in a user-friendly way
		// Create toString method in the Weather class
		// Output:
		// "Weather forecast in 'Latvia' for next days '-2, 0, 5, 2, 6, -1, 0'"
		 System.out.println(latvia);
		 System.out.println(turkey);
		 System.out.println(norway);

		// Send a link of your github repository to your lecturer in slack
		// Wait until everyone reaches that point or ask for an extra task
		// -------------------------------------------------------------------------------------
		 
		// Task 7 - Create a method in class Weather which will return average temperature for days
		// method signature: public double getWeekAverage()
		// Output: Average temperature in Latvia will be 1.8
		System.out.println("Average temperature in Latvia will be "+latvia.getWeekAverage());

		// Task 8 - Create a method in class Weather which will return highest temperature              
		// Output: Highest temperature in Latvia will be 6
		System.out.println("Highest temperature in Latvia will be " + latvia.getHottestTemperature());

		// Task 9 - Create a method in class Weather which will return hottest day name, lets assume:
		// - first day of week is Monday  
		// - there will be 7 days forecasts only
		// Use switch statement in order to solve it
		// Output: Hottest day in Latvia will be Friday
		 System.out.println("Hottest day in Latvia will be " + latvia.getHottestDayName());

		// Task 10 - Create a method in class Weather which will return highest temperature          
		// Output: Lowest temperature in Latvia will be -2
		 System.out.println("Lowest temperature in Latvia will be " +latvia.getColdestTemperature());                       

		// Task 11 - Create a method in class Weather which will return coldest day name:
		// Output: Hottest day in Latvia will be Monday
		 System.out.println("Hottest day in Latvia will be " + latvia.getColdestDayName());
		              
		// Task 12 - User wants to get advanced information printed out into console about weather in specific country
		// Create method printAdvancedInformation() in Weather class
		// Output:
		// "In 'Latvia' during next 7 day will be following weather '-2, 0, 5, 2, 6, -1, 0',
		// the highest temperature will be on Friday +6 degree,
		// the lowest temperature will be on Monday -2 degree"
		 latvia.printAdvancedInformation();
		 turkey.printAdvancedInformation();
		 norway.printAdvancedInformation();

		// Task 13 - we need possibility to update weather temperature based on coming warm cyclone, and increase weather temperature for each day 
		// by one degree
		// create a public void applyWarmCycloneEffect()
		// Output: "Weather forecast  in 'Latvia' for next days '-1, 1, 6, 3, 7, 0, 1'"
		 latvia.applyWarmCycloneEffect();
		 System.out.println(latvia);
		 
		// -------------------------------------------------------------------------------------
		 
		// Task 14 - I want to be able to convert Celsius temperature into Fahrenheit
		// create a static method in Weather class: public static double celsiusToFahrenheit(double celsiusTemperature)
		// Output: 10 in Celsius will be 50 in Fahrenheit
		// System.out.println("10 in Celsius will be "+ Weather.celsiusToFahrenheit(10) +" in Fahrenheit");           

		// Task 15 - We need that some one would provide to us weather forecast for specific country
		// - create a static method which will create a 7 day forecast for specific country
		//   public static Weather getWeatherForecast(String countryName)          
		// - google for random value generator, in order to fill day weather with some values
		// Example:
		// Weather lithuania = Weather.getWeatherForecast("Lithuania");

		// Extra Task 16 - I as a worker of weather forecast center want to be able to overview and interact with weather forecasts
		// - create a new class WeatherForecastApp in package com.accentrue.lecture15
		// - create a predefined list of weather forecast, at least for 3 countries and store them in ArrayList
		// - User should be interact through console and should be able to:
		// -- [l] - list country names for which forecast exist
		// -- [a] - add new forecast, by providing country name and one day forecast temperature      
		// -- [d] - delete forecast, by specifying country name
		// -- [g] - generate new weather forecast, by specifying country name
		// -- [q] - quit the program

		// Extra task 17 - make getHottestDayName() work with 7+ days forecast

		// Extra Task 18 - Add information about wind for each day

		// Extra Task 19 - Represent day temperature by dayMax and dayMin, same for wind
		// Hint: think about representing weather for specific day as another Object which will have fields, minTemp, maxTemp, minWind, maxWind
		 

	}

}
