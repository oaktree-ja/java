package com.trump.day11.oop.abstractpkg.exercise;

public class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		int result = a+b;
		return result;
	}

	@Override
	public int substract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		// int [] a = new int[5];
		// 평균 = 합 / 크기
		// 합 : 배열에 있는 값을 꺼내서 더해 ( 누적합 )
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double avg = (double)sum / a.length;
		return avg;
	}

	public static void main(String[] args) {
		// Cannot instantiate the type Calculator
//		Calculator calculator = new Calculator();
		Calculator calculator = new GoodCalc();
		System.out.println(calculator.add(11, 18));
		System.out.println(calculator.substract(11, 18));
		int [] arrs = {11, 18, 5, 2};
		System.out.println(calculator.average(arrs));
		
		
		GoodCalc calc = new GoodCalc();
		System.out.println(calc.add(11, 18));
		System.out.println(calc.substract(11, 18));
		int [] nums = {11, 18, 5, 2};
		System.out.println(calc.average(nums));
		//calc.add(11, 18);
	}
}

















