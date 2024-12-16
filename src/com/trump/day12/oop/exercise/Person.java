package com.trump.day12.oop.exercise;

public class Person {
	private String name;
	private String age;
	
	public Person() {}
	public Person(String name, String age) {
		this.name =name;
		this.age =age;
	}
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String inform() {
		return name +"님("+age +"세)";
	}
	@Override
	public String toString() {
		return "이름 : " +name +",나이 :" +age;
	}
	
	public static void main(String[]args) {
		Person[]pArr = new Person[3];
		pArr[0].getAge();
		
	}
}
