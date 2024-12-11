package com.trump.day10.oop.encapsulation;

class CircleVO {
	private int radius;
	
	public CircleVO() {}
	
	public CircleVO(int radius) {
		this.radius = radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class Circle {
	public static void main(String[] args) {
		CircleVO circle = new CircleVO();
		circle.setRadius(10);
		//CircleVO circle = new CircleVO(10);
		//circle.radius = 10;
		System.out.println("넓이 : " + circle.getArea());
	}
}



















