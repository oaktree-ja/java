package com.trump.day08.oop;

public class Circle {
	final double PI = 3.14;
	double radius;
	
	public double getArea() {
		return PI*radius*radius;
	}
	
	public static void main(String [] args) {
		Circle pizza = new Circle();
		pizza.radius = 10;
		System.out.println(pizza.getArea());
		
		Circle donut = new Circle();
		donut.radius = 2;
		System.out.println(donut.getArea());
	}
}
