package com.trump.day08.method;

public class Run_Method {

	public static void main(String[] args) {
		Exam_Method em = new Exam_Method();
		//리턴형 X, 매개변수 X
		em.noReturnNoParam();
		// 리턴형 X, 매개변수 O
		em.noReturnYesParam(20250502);
		//리턴형 O, 매개변수 X
		System.out.println(em.yesReturnNoParam());
		// 리턴형 O, 매개변수 O
		int result = em.yesReturnYesParam(1000);
		System.out.println(result);
		
		result = em.sum(1,2,3,4,5);
		System.out.println("result : " + result);
	}

}
