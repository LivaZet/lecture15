package com.accenture.lecture13;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		int[] myArrays = new int[10];
		for (int i = 0; i < myArrays.length; i++) {
			myArrays[i] = i * 2;

		}

		// Task 0 - move "Hello world" output into a method sayHi() and call it twice
		// You should get the following printed out into the console:
		// Hello world
		// Hello world
		sayHi();
		sayHi();

		// Task 1 - print out the content of myArray into the console as follows
		// 0 element is 0
		// 1 element is 2
		// 2 element is 4
		// 3 element is 6
		// 4 element is 8
		// 5 element is 10
		// 6 element is 12
		// 7 element is 14
		// 8 element is 16
		// 9 element is 18

		for (int i = 0; i < myArrays.length; i++) {
			System.out.println("" + i + " element is " + myArrays[i]);
		}

		// Task 1.1 - printArray() should do the same logic as the above code
		// 0 element is 0
		// 1 element is 2
		// ...
		// 9 element is 18

		printArray(myArrays);

		// Task 2 - getSum() should return the sum of all elements of a passed array
		// You should get the following : "Sum is 90 " printed out into the console
		int sum = getSum(myArrays);
		System.out.println("Sum is " + sum);

		// Task 3 - getAvarege() should return the average of all the elements of a passed array
		// You should get "Average is 9" printed out into the console
		int average = getAverage(myArrays);
		System.out.println("Average is " + average);

		// Task 3.1 - declare a method getMaxValue(), it should return the biggest element value of an array
		// You should get "Maximum is 18.0" printed out into the console
		int max = getMaxValue(myArrays);
		System.out.println("Maximum is " + max);

		// Task 3.2 - declare a method getAvaregeDouble(), it should return the sum of all the elements of a passed array
		// You should get "Average is 9.0" printed out into the console
		double doubleAverage = getAverageDouble(myArrays);
		System.out.println("Avarege double value is " + doubleAverage);

		// Task 4 - getArrayDefinedByUser() - it should ask the user to fill an array of 3 elements and return that array
		// Possible console content:
		// Enter 3thy:
		// 3
		// 6
		// 7
		// 0 element is 3
		// 1 element is 6
		// 2 element is 7
		int[] myIntegers = getArrayDefinedByUser(3);
		printArray(myIntegers);

		// Task 6 - make sure getAvarege() and getAvaregeDouble() methods use a getSum() method
		// they shouldn't duplicate logic with sum() method

		// Task 7 - rewrite the printArray() to use enhanced loop

		// Task 8 - create your own method, which
		// - at first, will ask user how big array he wants to create *you will
		// need to use Scanner class
		// - after user should enter in console value for each element of an
		// array
		// - at the end array should be printed out into console *you can reuse
		// already existing method printArray()
		// Possible console content:
		// Enter array size:
		// 4
		// Enter value of each array element:
		// 5
		// 2
		// 1
		// 12
		// 0 element is 5
		// 1 element is 2
		// 2 element is 1
		// 3 element is 12

		int[] userArray = userMadeArray();
		printArray(userArray);

		// Task 8.1 - rewrite your program, that Scanner object would be
		// initialized only once in your program
		// * hint, think about making Scanner instance(object) as a class static
		// field and refer to it in your code

	}

	public static void sayHi() {
		System.out.println("Hello World");
	}

	public static void printArray(int[] someArray) {
		int i = 0;
		for (int value : someArray) {
			System.out.println("" + i + " element is " + value);
			i++;
		}
	}

	public static int getSum(int[] someArray) {
		int sum = 0;
		for (int i = 0; i < someArray.length; i++) {
			sum = sum + someArray[i];
		}
		return sum;
	}

	public static int getAverage(int[] someArray) {
		int average = 0;
		int sum = getSum(someArray);
		average = sum / someArray.length;
		return average;
	}

	public static int[] getArrayDefinedByUser(int numbers) {
		int[] someArray = new int[numbers];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter " + numbers + " elements: ");
		int elements;
		for (int i = 0; i < numbers; i++) {
			elements = scanner.nextInt();
			someArray[i] = elements;
		}
		return someArray;
	}

	public static int getMaxValue(int[] someArray) {
		int max = someArray[0];
		for (int i = 0; i < someArray.length; i++) {
			if (someArray[i] > max) {
				max = someArray[i];
			}
		}
		return max;

	}

	public static double getAverageDouble(int[] someArray) {
		double average = 0;
		int sum = getSum(someArray);
		average = sum / (double) someArray.length;
		return average;

	}

	public static int[] userMadeArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert array size: ");
		int arraySize = scanner.nextInt();
		int[] someArray = new int[arraySize];
		System.out.println("Please enter array elements: ");
		int elements;
		for (int i = 0; i < arraySize; i++) {
			elements = scanner.nextInt();
			someArray[i] = elements;
		}
		return someArray;
	}

}
