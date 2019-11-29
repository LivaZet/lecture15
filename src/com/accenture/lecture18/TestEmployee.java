package com.accenture.lecture18;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee (1, "John", "Doe", 500);
		System.out.println(employee1);
		System.out.println(employee1.getAnnualSalary());
		employee1.raiseSalary(15);
		System.out.println(employee1);
		
	}

}
