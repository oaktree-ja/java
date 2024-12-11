package com.trump.day11.oop.objectpkg.exercise;

public class Point {
	private int x, y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		return this.x == p.x && this.y == p.y;
//		return super.equals(obj);
	}
}
