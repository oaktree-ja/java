package com.trump.day10.oop.inheritance.point;

public class Point {
	public int pub;		// public은 모두 공개
	int def;			// default는 같은 패키지 내에서
	protected int pro;  // protected는 같은 패키지 
						// + 상속한 자식클래스에만
	private int pri;	// private은 외부로부터 차단
	
	private int x, y;
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// setter
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	// getter
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public void showPoint() {
		System.out.println(x + ", " + y);
	}
}
