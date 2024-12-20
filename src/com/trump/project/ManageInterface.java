package com.trump.project;

import java.util.List;



/*
 *근무일지 확인 하는 시스템을 만드시오
 *
 *1. 전체 근무자 확인
 *
 *2. 자기 이름 검색
 *
 * 3. 12월 3주차에 스케쥴러에 스케쥴 입력 하기
 * 3-1 각 요일별 스케쥴에 근무인원  넣기
 *
 *
 *4. 본인의 출근 시간 맞다면 y/n 입력 시스템
 *
 ***띄어쓰기 할때 sc.nextLine(); 입력 하기 중간에 끊어 줄때에도 한번씩 받아주기
 */


public interface ManageInterface {
	
	List<Employee> selectAllStudents();
	
	Employee serchOneByName(String employee);
	
	public int serchIndexByName(String name);
	
	
	
	
	
}
