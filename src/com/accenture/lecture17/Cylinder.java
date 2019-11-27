package com.accenture.lecture17;

public class Cylinder extends Circle {

	private double height = 1.0;

	public Cylinder(double height) {
		// super();
		this.height = height;
	}

	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}

	public Cylinder(double height, double radius, String color) {
		this.height = height;
		this.radius = radius;
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
		System.out.println("The height is " + height + ".");
	}

	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", getVolume()=" + getVolume()
				+ ", getRadius()=" + getRadius() + "]";
	}

	public double getVolume() {
		return getArea() * height;
	}

	@Override
	public double getArea() {
		return super.getArea() * 2 + height * 2 * Math.PI * radius;

	}
}
