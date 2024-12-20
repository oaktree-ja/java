package com.trump.day09.oop;

public class Student {
	public String name = "";
	public int kor = 0;
	public int eng = 0;
	public int math = 0;
	
	public int total() {
		return kor+eng+math;
	}
	
	public double avg() {
		return this.total()/3.0;
	}
}
