package com.accenture.lecture18;

public class TestAccount {

	public static void main(String[] args) {
			
		Account empl1 = new Account("1", "John Doe", 500);
		System.out.println(empl1);
		empl1.credit(50);
		System.out.println(empl1);
		empl1.debit(150);
		System.out.println(empl1);
		
		Account empl2 = new Account("2", "Jane Doe", 500);
		empl1.transferTo(empl2, 250);
		System.out.println(empl1);
		System.out.println(empl2);
		
	}

}
