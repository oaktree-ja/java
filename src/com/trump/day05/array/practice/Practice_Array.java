package com.trump.day05.array.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice_Array {
	public void practice1() {
		/*
		 * 길이가 10인 배열 선언
		 * 1부터 10까지 값 
		 * 반복문을 이용하여 순서대로 배열에 저장
		 */
		int [] arrs;
		arrs = new int[10];
		for(int i = 0; i < 10; i++) {
			arrs[i] = (i+1);
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(arrs[i]+ " "); 
		}
	}
	public void practice2() {
		/*
		 * 길이가 10인 배열 선언
		 * 10부터 1까지 값 
		 * 반복문을 이용하여 순서대로 배열에 저장
		 */
		int [] arrs = new int[10];
		for(int i = 0, count=10; i < 10; i++,count--)
			arrs[i] = count;
		for(int i = 0; i < 10; i++)
			System.out.print(arrs[i]+ " ");
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int [] nums = new int[input];
		// 배열에 데이터 저장 (1 ~ input까지)
		for(int i = 0; i < input; i++) {
			nums[i] = (i+1);
			System.out.print(nums[i] + " ");
		}
	}
	public void practice4() {
		/*
		 * 길이가 5인 String 배열 선언
		 * "사과", "귤", "포도", "복숭아", "참외" 순서대로 저장
		 * 그리고 배열 인덱스를 이용해서 귤 출력
		 */
		String fruits [];
		fruits = new String[5];
		fruits[0] = "사과";
		fruits[1] = "귤";
		fruits[2] = "포도";
		fruits[3] = "복숭아";
		fruits[4] = "참외";
		System.out.println(fruits[1]); // 귤
		for(int i = 0; i < fruits.length; i++)
			System.out.print(fruits[i] + " ");
	}
	public void practice5() {
		System.out.println("practice5");
	}
	public void practice6() {
		System.out.println("practice6");
	}
	public void practice7() {
		// 사용자가 배열의 길이를 직접 입력
		// 그 값만큼 정수형 배열을 선언, 생성 및 초기화
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int [] nums = new int[input];
		int sum = 0;
		// 배열의 크기만큼 사용자가 직접 값을 입력, 각각의 인덱스에 값을 초기화
		for(int i = 0; i < nums.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			input = sc.nextInt();
			nums[i] = input;
			// 누적합
			sum += nums[i];
		}
		// 전체값을 나열하고.. + 각 인덱스에 저장된 값들의 합 출력
		for(int num: nums) 
			System.out.print(num + " ");
		
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	public void practice8() {
		System.out.println("practice8");
	}
	public void practice9() {
		System.out.println("practice9");
	}
	public void practice10() {
		System.out.println("practice10");
	}
	public void practice11() {
		/*
		 * 로또 번호 자동 생성 프로그램을 작성하시오
		 * 단, 중복값 없이 오름차순으로 정렬하여 출력하세요.
		 */
		int [] lottos = new int[6];
		Random rand = new Random();
		for(int i = 0; i < lottos.length; i++) {
			// 1 ~ 45 사이의 숫자가 랜덤하게 나와야 함.
			//System.out.print((rand.nextInt(45)+1)+ " ");
			// 배열안에 넣어보기
			lottos[i] = rand.nextInt(45)+1;
			
			for(int j = 0; j < i; j++) {
				if(lottos[i] == lottos[j]) {
					i--;
				}
			}
			
//			// #1
//			if(lottos[1] == lottos[0]) {
//				i--;
//			}
//			// #2
//			if(lottos[2] == lottos[1]) {
//				i--;
//			}
//			if(lottos[2] == lottos[0]) {
//				i--;
//			}
//			
//			// #3
//			if(lottos[3] == lottos[2]) {
//				i--;
//			}
//			if(lottos[3] == lottos[1]) {
//				i--;
//			}
//			if(lottos[3] == lottos[0]) {
//				i--;
//			}
//			
//			// #4
//			if(lottos[4] == lottos[3]) {
//				i--;
//			}
//			if(lottos[4] == lottos[2]) {
//				i--;
//			}
//			if(lottos[4] == lottos[1]) {
//				i--;
//			}
//			if(lottos[4] == lottos[0]) {
//				i--;
//			}
//			
//			// #5
//			if(lottos[5] == lottos[4]) {
//				i--;
//			}
//			if(lottos[5] == lottos[3]) {
//				i--;
//			}
//			if(lottos[5] == lottos[2]) {
//				i--;
//			}
//			if(lottos[5] == lottos[1]) {
//				i--;
//			}
//			if(lottos[5] == lottos[0]) {
//				i--;
//			}
		}
		System.out.println();
		// 선택, 삽입, 버블, 퀵, 머지, ...
		for(int j = 0; j < (lottos.length-1); j++) {
			for(int i = 0; i < (lottos.length-1)-j; i++) {
				if(lottos[i] > lottos[i+1]) {
					int temp = lottos[i];
					lottos[i] = lottos[i+1];
					lottos[i+1] = temp;
				}
			}
		}
		for(int lotto: lottos) {
			System.out.print(lotto + " ");
		}
		System.out.println();
	}
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		boolean flag = true;
		switch(name) {
			case "홍길동": break;
			default: flag = false;
		}
//		if(!name.equals("홍길동")){
//			flag = false;
//		}
		String result = "본인이";
		
//		switch(flag) {
//			case true: result += "맞습니다"; break;
//			case false: result += "아닙니다"; break;
//		}
		
		if(flag){
			result += "맞습니다";
		} else {
			result += "아닙니다";
		}
		System.out.print(result);

	}
}
















