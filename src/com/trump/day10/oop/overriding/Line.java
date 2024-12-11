package com.trump.day10.oop.overriding;

public class Line extends Shape{
	
	@Override
	public void draw() {
		//super.draw();
		System.out.println("Line");
	}
}
