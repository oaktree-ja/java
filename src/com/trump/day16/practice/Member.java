/*
 * 회원의 정보를 저장하기 위하여 Member객체를 생ㅅ겅 하였다 
 * Member 객체를 사용하여 데이터를 입력하고 출력하기 위해 소스 코드를 작성 하였는데 컴파일시 문제가 발생 하였다
 * Member 객체 및 소스코드를 분석하여 원인(문제점 + 사유) 및 조치 내용(해결방안)을 작성하시오
 * 
 */

package com.trump.day16.practice;

public class Member {
	private String name;
	private int age;
	private String address;
	private String hobby;
	public Member(String name, int age, String address, String hobby) {
		this.name=name;
		this.age=age;
		this.address= address;
		this.hobby= hobby;
		
	}
	public String getNmae() {return name;}
	public void setName(String name) {this.name =name;}
	public int getAge() {return age;}
	public void setAge(int Age) {this.age =age;}
	
	

}
