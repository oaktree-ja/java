package com.trump.day15.collection.student;

import java.util.List;

public interface ManageInterface {

	void registerStudent(Student student);
	
	List<Student> searchListByName(String name);
	
	Student searchOneByName(String name);
	

	List<Student> selectAllStudents();
	
	public int searchIndexByname(String name);
	
	void modifyStudent(int index, Student student);
	
	void deleteStudent(int index);
	
	String searchFailResult(Student student);
	
	
}