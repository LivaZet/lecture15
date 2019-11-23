package com.accenture.lecture15;

import java.util.Arrays;

public class ObjectPractice {

	public static void main(String[] args) {

		// Task 1 - Lets make our Weather class to store following information:
		// String country - for which forecast is prepared.
		// int[] daysWeather- temperature information for next week (7 days).

		// Task 2 - We should be able to create a new object of class Weather by
		// passing
		// both field values.
		// Create constructor in Weather class
		// public Weather(String country , int[] daysWeater)

		// Task 3 - We should prohibit to reassign country field value for
		// weather objects
		// Make it final

		// Task 4 - Lets create few weather forecasts for following countries:
		// Latvia,
		// Antaliya, Bergen
		// Example:
		Weather latvia = new Weather("Latvia", new int[] { -2, 0, 5, 2, 6, -1, 0 });
		Weather turkey = new Weather("Antaliya", new int[] { 15, 20, 32, 28, 35, -31, 29 });
		Weather norway = new Weather("Bergen", new int[] { -5, -10, -4, 0, 3, -2, 1 });

		// Task 5 - We should prohibit direct access to Weather object fields
		// Make fields private
		// Create getters for them
		// Output: Latvia [-2, 0, 5, 2, 6, -1, 0]
		 System.out.println(latvia.getCountry() + " " + Arrays.toString(latvia.getDaysWeather()));
		 System.out.println(turkey.getCountry() + " " + Arrays.toString(turkey.getDaysWeather()));
		 System.out.println(norway.getCountry() + " " + Arrays.toString(norway.getDaysWeather()));

		// Task 6 - User should be able to get weather information in
		// user-friendly way
		// Create toString method in Weather class
		// Output:
		// "Weather forecast in 'Latvia' for next days '-2, 0, 5, 2, 6, -1, 0'"
		 System.out.println(latvia);
		 System.out.println(turkey);
		 System.out.println(norway);

		// Send a link of your github repository to lecturer in slack
		// Wait until everyone will reach that point eiter ask for extra task
		// -------------------------------------------------------------------------------------

	}

}
