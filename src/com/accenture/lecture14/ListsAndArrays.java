package com.accenture.lecture14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListsAndArrays {

	public static void main(String[] args) {

		String goToArray = "Mazda";

		int[] array = new int[3];
		System.out.println("Array's length: " + array.length);

		array[0] = 1;
		// array[4] = 30;
		System.out.println(Arrays.toString(array));

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Volvo");
		arrayList.add("Lada");
		arrayList.add("Tesla");
		arrayList.add("Skoda");
		arrayList.add("BMW");
		arrayList.add("Ford");
		arrayList.add("Opel");
		arrayList.add("Nissan");
		arrayList.add("Honda");
		arrayList.add("Jaguar");
		
		System.out.println("Search Volvo: " + arrayList.contains("Volvo"));
		

		loopArrayToString(arrayList);

		System.out.println("ArrayList size is: " + arrayList.size());

		arrayList.remove(2);

		loopArrayToString(arrayList);

		arrayList.set(1, goToArray);

		System.out.println("ArrayList size is: " + arrayList.size());

		String elementZero = arrayList.get(0);
		System.out.println("Element Zero is: " + elementZero);

		ArrayList<Double> arrayTest = new ArrayList<>();
		arrayTest.add(288.4);
		loopArrayDoubleToString(arrayTest);
		
		User user = new User("Janis", 33333);
		System.out.println(user.getName());
		
		ArrayList <User> userArray = new ArrayList<>();
		userArray.add(new User("Anna", 303030303));
		userArray.add(new User("Denis", 2020202));
		userArray.add(user);
		System.out.println(userArray.size());
		
		loopArrayUserToString(userArray);
		
//		List<Integer> listArr = new ArrayList<>();
//		listArr.add(3);
//		listArr.add(9);
//		listArr.add(4);
//		listArr.add(12);
//		listArr.add(5);
//		listArr.add(8);
//		System.out.println(listArr.size());
		
		List<String> listArr = new ArrayList<>();
		listArr.add("3");
		listArr.add("9");
		listArr.add("4");
		listArr.add("7");
		listArr.add("11");
		listArr.add("8");
		System.out.println(listArr.size());
		
		//listArr.clear();
		
//		listArr.forEach(listArr -> {System.out.println(listArr);});
		
		Iterator<String> iterator = listArr.iterator();
		while(iterator.hasNext()){
			String listToString = iterator.next();
			System.out.println("List element to count: " + listToString);
		}
		System.out.println("//////////////");
		List<Integer> listArrInt = new ArrayList<>();
		listArrInt.add(34);
		listArrInt.add(12);
		listArrInt.add(55);
		listArrInt.add(95);
		listArrInt.add(66);
		listArrInt.add(40);
		Collections.sort(listArrInt);
		Iterator<Integer> iteratorName = listArrInt.iterator();
		while(iteratorName.hasNext()){
			Integer listToString = iteratorName.next();
			System.out.println("New list element to count: " + listToString);
		}
		
	}

	public static void loopArrayToString(ArrayList<String> arrays) {
		for (int i = 0; i < arrays.size(); i++) {
			System.out.println("Element value of arrayList: " + arrays.get(i)
					+ " index is " + i);
		}
	}

	public static void loopArrayDoubleToString(ArrayList<Double> arrays) {
		for (int i = 0; i < arrays.size(); i++) {
			System.out.println("Element value of arrayList: " + arrays.get(i)
					+ " index is " + i);
		}
	}

	public static void loopArrayUserToString(ArrayList<User> arrays) {
		for (User arr : arrays) {
			System.out.println("User name: " + arr.getName() + "; User bank account: " + arr.getBankAcc());
		}
}
}