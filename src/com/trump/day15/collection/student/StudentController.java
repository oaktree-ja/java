package com.trump.day15.collection.student;

import java.util.List;

public class StudentController {
	public static void main (String[]args) {
		StudentView view = new StudentView();
		StudentManage manage =new StudentManage();
		String name;
		int index;
		List<Student>sList;
		finish:
		while(true) {
			int choice = view.printMenu();
			switch(choice){
			case 1: 
				Student student = view.inputStudent();
				manage.registerStudent(student);
				break;
			case 2:
				name = view.inputName(null);
				sList=manage.searchListByName(name);
				view.displayStudents(sList);

				break;
			case 3 : 
				sList = manage.selectAllStudents();
				view.displayStudents(sList);
				break;
			case 4 :
				name = view.inputName("수정");
				index = manage.searchIndexByname(name);
				if(index !=-1) {// 수정할 데이터가 존재하면 수정할 데이터 입력
					student = manage.searchOneByName(name);//이름으로 저장된 정보를 가져옴
					student = view.modifyStudent(student); // 저장된 정보를 수정해서 리턴해줌 -> 수정할 정보가 student에 있음
					manage.modifyStudent(index, student); //인덱스와 수정된 정보를 저장한 student를 넘겨서 대체해줌
				}
				break;
			case 5 :
				name= view.inputName("삭제");
				index = manage.searchIndexByname(name);
				if(index !=-1)//데이터가 있으면
					manage.deleteStudent(index);
				break;
			case 6:
				name=view.inputName("재평가 여부 확인");
				student = manage.searchOneByName(name);
				manage.searchFailResult(student);
			break;
				
			case 0 : 
				view.displayMsg("프로그램이 종료되었습니다");
				break finish;
			default: 
				view.displayMsg("잘못입력하셨습니다");
				break;
			}
		}
	}
}