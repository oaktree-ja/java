package com.trump.day15.collection.student;


import java.util.List;
import java.util.Scanner;

public class StudentView implements ViewInterface{

	@Override
	public Student inputStudent() {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("====학생정보입력====");
		System.out.println("이름 : ");
		String name=sc.next();
		System.out.println("1차점수 :");
		int firstScore = sc.nextInt();
		System.out.println("2차점수 :");
		int secondScore = sc.nextInt();
		student.setName(name);
		student.setFirstScore(firstScore);
		student.setSecondScore(secondScore);
		return student;
	}

	@Override
	public void displayStudents(List<Student> stdList) {
		System.out.println("=====학생 전체정보 출력======");
		for(int i = 0;i<stdList.size(); i++) {
			System.out.println(stdList.get(i).toString());
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public int printMenu() {
		Scanner sc= new Scanner(System.in);
		System.out.println("=====학생 성적 관리 프로그램======");
		System.out.println("1.학생 정보입력");
		System.out.println("2.학생 정보출력");
		System.out.println("3.학생 정보 전체 출력");
		System.out.println("4.학생 정보 수정");
		System.out.println("5.학생 정보 삭제");
		System.out.println("6.재평가 대상 여부 확인");

		System.out.println("0.프로그램 종료");
		System.out.print("선택");
		int choice = sc.nextInt();
		return choice;
	}

	@Override
	public void displayMsg(String msg) {
		System.out.println(msg);
		
	}
	@Override
	public String inputName(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 이름 입력: ");
		String name = sc.next();
		return name;
		
	}

	@Override
	public Student modifyStudent(Student student) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 1차 점수 입력: ");
		int firstScore =sc.nextInt();
		student.setFirstScore(firstScore);
		System.out.println("수정할 2차 점수 입력 : ");
		int secondScore = sc.nextInt();
		student.setSecondScore(secondScore);
		return student;
	}
	




}