package com.trump.day10.oop.overloading;

class Book {
	private String name;
	private String author;
	
	public Book() {}
	
	public Book(String name) {}
	
	public Book(String name, String author) {}
}

public class Exam_Overloading {
	
	public void getSomeMoney() {}
	
	public void getSomeMoney(int money) {}
	
	public void getSomeMoney(long money) {}
	
	public void getSomeMoney(double money) {}
	
	public void println(String message) {}
	
	public void println(int message) {}
	
	public void println(double message) {}
	
	public void println(boolean message) {}
	
	public static void main(String[] args) {
		/*
		 * 메소도 오버로딩
		 * 메소드의 이름은 똑같으나 매개변수의 갯수나 타입이 달라야 적용됨
		 * 오버로딩이 적용되어 있는 사례
		 * System.out.println();
		 */
		System.out.println("헬로우 오버로딩");
		System.out.println(10);
		System.out.println(1.1);
		System.out.println(true);
	}
}
