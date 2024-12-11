package com.trump.day11.oop.objectpkg;

import com.trump.day10.oop.encapsulation.Book;

class Member {
	// 필드 
	private String name;
	private int age;
	private String email;
	private String phone;
	private String address;
	
	// 생성자
	public Member() {}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Member(String email, String phone, 
								String address) {
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	public Member(String name, int age, 
			String email, String phone, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	// 메소드
	// getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat() {}
	public void sleep() {}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return "이름 : " + name + ", 나이 : " + age
				+ ", 이메일 : " + email
				+ ", 전화번호 : " + phone
				+ ", 주소 : " + address;
	}
}

public class Exam_ObjectProperty {
	
	static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
	}
	
//	static void print(Member member) {
//		System.out.println(member.getClass().getName());
//		System.out.println(member.hashCode());
//		System.out.println(member.toString());
//	}
//	
//	static void print(Book book) {
//		System.out.println(book.getClass().getName());
//		System.out.println(book.hashCode());
//		System.out.println(book.toString());
//	}
	
	public static void main(String[] args) {
		String data = "Java";
		data = new String("Java");
		if("Java".equals(data)) {
		//if("Java" == data) {
			System.out.println("똑같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		System.out.println();
		
		Member member = new Member();
		member = new Member("일용자", 22, "khuser01@kh.com", "01082829333", "서울시 중구");
		print(member);
		Book book = new Book();
		print(book);
//		System.out.println(member.getClass().getName());
//		System.out.println(member.hashCode());
//		System.out.println(member.toString());
		
		//member.getClass().getName();
	}
}


















