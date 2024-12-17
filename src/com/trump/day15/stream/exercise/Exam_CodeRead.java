package com.trump.day15.stream.exercise;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_CodeRead {
	
	/*
	 * Exam_InputStreamReadByteOff.java 파일을 읽어서 콘솔에 출력해보세요
	 * 단, 문자 기반 스트림을 이용하세요
	 */
public static void main(String[]args) {
	try {
		InputStream is = new FileInputStream("C:\\Windows\\system.ini");
		int readCount;
		byte [] readBytes = new byte[3];
		String result = "";
		while((readCount = is.read(readBytes,0,3)) != -1){
			//System.out.println((char)readCount);
			//읽은 값이 바이트 배열 -> 스트링으로 변환 필요
			result += new String (readBytes, 0 , readCount);
		}
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
}
	
	

}
