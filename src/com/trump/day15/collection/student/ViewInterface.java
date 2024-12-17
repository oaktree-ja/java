package com.trump.day15.collection.student;

import java.util.List;

public interface ViewInterface {
	public Student inputStudent();
	
	
	public  void displayStudents(List<Student> stdList);
	
	public int printMenu();
	
	public void displayMsg(String msg);


	String inputName(String category);


	Student modifyStudent(Student student);
	
	
	
	
}