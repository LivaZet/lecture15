package com.accenture.lecture18;

public class MyPoint {

	private int x = 0;
	private int y = 0;
	private int[] array = new int [2];
	
	public MyPoint(){
	}
	
	public MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY(){
		return array;
	}
	
	public void setXY(int x, int y){
		int[] array = new int[2];
		this.array[0] = this.x;
		this.array[1] = this.y;
	}

	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}
	
	public double distance (int x, int y){
		return distance(x, y);
	}
	
	public double distance (int another){
		return distance(another);
	}
	
	public double distance(){
		return x;
		
	}
	
}
