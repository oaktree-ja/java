package com.trump.day13.oop;

import java.util.Scanner;

import com.trump.day09.oop.Student;

public class StudentManage {
	static Student[] students = new Student[3];
	static int index = 0;
	
	public void insertStudent() {
		Scanner sc = new Scanner(System.in);
		students[index]=new Student();
		students[index].name=sc.next();
		students[index].kor=sc.nextInt();
		students[index].eng=sc.nextInt();
		students[index].math=sc.nextInt();
		
//		for(int i =0; i<students.length; i++) {
//			students[i]=new Student();
//			students[i].name=sc.next();
//			students[i].kor=sc.nextInt();
//			students[i].eng=sc.nextInt();
//			students[i].math=sc.nextInt();
		}
	}

