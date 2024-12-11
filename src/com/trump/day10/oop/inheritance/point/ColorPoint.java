package com.trump.day10.oop.inheritance.point;

public class ColorPoint extends Point {
//	private int x, y;
	private String color;
	
	public ColorPoint() {
		//super();
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void showColorPoint() {
//		super.x = 10;
//		super.y = 20;
		super.showPoint();
		System.out.println(this.color + "색의 점입니다.");
	}
}
