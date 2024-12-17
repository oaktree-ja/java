package com.trump.day15.collection.student;

import java.util.ArrayList;
import java.util.List;

public class StudentManage implements ManageInterface{

	private List<Student> sList;
	
	public StudentManage() {
		sList = new ArrayList<Student>();
	}

	@Override
	public List<Student> searchListByName(String name) {
		if(name !=null) {
			List<Student> searchList = new ArrayList<Student>();
			for(Student std:sList) {
				if(name.equals(std.getName())) {
					searchList.add(std);
				}
			}return searchList;
		}
		return null;
	}

	@Override
	public Student searchOneByName(String name) {
		// TODO Auto-generated method stub
		if(name != null) {
			for(Student std:sList) {
				if(name.equals(std.getName())) {
					return std; //찾으면 그때의 값을 리턴
				}
			}
		}
		return null;
	}
	@ Override
	public void deleteStudent(int index) {
		sList.remove(index); // 이름으로 입력받지만 인덱스로 리턴해줘서 인덱스값을 삭제할 수 있게 함
		// 보통은 void대신에 boolean으로 여부를 판단
	}
	
	@Override
	public int searchIndexByname(String name) {
		int count= 0;  //
		if(name!= null) {
			for(Student std:sList) {
				if(name.equals(std.getName())) {
					return count;
				}
				count++;
			}
		}
		return -1;
	}
	
	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		return sList;
	}
	
	
	@Override
	public void registerStudent(Student student) {
		sList.add(student);
	}
	

	@Override
	public void modifyStudent(int index, Student student) {
		// TODO Auto-generated method stub
		
	}

	public String searchFailResult(Student student) {
		if(student !=null) {
			int firstScore, secondScore;
			firstScore = student.getFirstScore();
			secondScore = student.getFirstScore();
			double avg = (firstScore +secondScore)/2.0;
			StringBuffer sb = new StringBuffer();
			if(avg >= 60) {
				if(firstScore<40) {
					System.out.println("1차 시험 재평가");
				}else if(secondScore<40){
					System.out.println("2차 시험 재평가");
				}else {
					System.out.println("모두 통과 하셨습니다");
				}
			}else {
				if(firstScore< 60) {
					System.out.println("1차 시험 재평가");
				}
				if(secondScore <60) {
					System.out.println("2차 시험 재평가");
				}
				return sb.toString();
		}
		}return null;
	}
	
}
	


	
	
