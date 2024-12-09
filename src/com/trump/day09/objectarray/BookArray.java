package com.trump.day09.objectarray;

import java.util.Scanner;

class Book {
	String name 	 = "";
	String author 	 = "";
	String price 	 = "";
	String publisher = "";
	
//	public Book() {
//		name = "";
//		author = "";
//		price = "";
//		publisher = "";
//	}
	
	void printInfomation() {
		System.out.println(name + "의 작가는 " + author + "입니다.  출판사는 " 
									+ publisher + "이고, 가격은 " + price +"입니다.");
	}
}

public class BookArray {
	public static void main(String[] args) {
//		Book book = new Book();
//		book.name = "자바의 신";
//		book.author = "김자바";
//		book.price = "25000";
//		book.publisher = "길벗이지톡";
//		book.printInfomation();
		Scanner sc = new Scanner(System.in);
		Book [] books = new Book[5];
		for(int i = 0; i < books.length ;i++) {
			books[i] = new Book();
			books[i].name = sc.next();
			books[i].author = "김자바";
			books[i].price = "25000";
			books[i].publisher = "길벗이지톡";
			books[i].printInfomation();
		}
		
	}
}
