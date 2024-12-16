package com.trump.day12.javaapi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam_Date {
	public static void main(String[]args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
		System.out.println();
	}

}
