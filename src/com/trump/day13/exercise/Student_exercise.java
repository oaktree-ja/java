package com.trump.day13.exercise;

public class Student_exercise {

	private int studentId;
	private String name;
	private String major;
	
	//-는 private, +는 public
	
	public Student_exercise () {} //생성자
	
	
	public Student_exercise(int studentId, String name,String major) {
		
	}
	// getter
			public int getStudentId() {
				return studentId;
			}
			public String getName() {
				return name;
			}
			public String getMajor() {
				return major;
			}

	// setter
		public void setStudentId(int studentId) {
			this.studentId=studentId;
		
		}
		public void setName(String name) {
			this.name=name;
			
		}
		public void setMajor(String major) {
			this.major=major;
			
		}
		
}
