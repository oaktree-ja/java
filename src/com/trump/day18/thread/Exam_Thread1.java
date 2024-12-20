package com.trump.day18.thread;

public class Exam_Thread1 {
	public static void main(String[]args) {
		for(int i =0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500); //전달 값으로 밀리 초를 받음 ,1ms = 1/1000초, 1000ms 는 몇초?=1초
				//Thread.sleep()는 Checked Exception 이라서 반드시 예외 처리 해줘야 한다
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		}
		
		for(int  i =5; i>=0; i--) {
			System.out.println(i);
		}
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
