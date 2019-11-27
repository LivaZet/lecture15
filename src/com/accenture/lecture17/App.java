package com.accenture.lecture17;

public class App  {

	
	public static void main(String[] args) {
	
		Circle circle1 = new Circle(4);
	//	circle1.getArea();
		
		Cylinder cylinder1 = new Cylinder(7, 4);
	//	cylinder1.getVolume();
		
		System.out.println(circle1);
		System.out.println(circle1.getArea());
		System.out.println(cylinder1);
		System.out.println(cylinder1.getVolume());
		System.out.println(cylinder1.getArea());
		
	}

}
