

	/*
	 * C:Windows\Web\Wallpaper\Windows\img0.jpg를 복사해서
	 * C:Temp\copyimg.jpg로 만들어주세요
	 * 단, 바이트 기반 스트림으로 사용하세요
	 * 
	 */
	
	
	
	
	package com.trump.day16.stream.exception.exercise;

	import java.io.*;

	public class Exercise_ImageCopy {
	    public static void main(String[] args) {
	        // 원본 파일 경로와 복사할 파일 경로 정의
	        String sourcePath = "C:\\Windows\\Web\\Wallpaper\\Windows\\img0.jpg";
	        String targetPath = "C:\\Temp\\copyimg.jpg";

	        // 파일 복사 작업 수행
	        try (
	            FileInputStream inputStream = new FileInputStream(sourcePath);
	            FileOutputStream outputStream = new FileOutputStream(targetPath)
	        ) {
	            // 바이트 데이터를 읽고 쓰기 위한 버퍼
	            byte[] buffer = new byte[1024];
	            int bytesRead;

	            // 파일 내용을 읽어서 복사
	            while ((bytesRead = inputStream.read(buffer)) != -1) {
	                outputStream.write(buffer, 0, bytesRead);
	            }

	            System.out.println("이미지 파일 복사가 완료되었습니다: " + targetPath);
	        } catch (FileNotFoundException e) {
	            System.err.println("원본 파일을 찾을 수 없습니다: " + e.getMessage());
	        } catch (IOException e) {
	            System.err.println("파일 처리 중 오류가 발생했습니다: " + e.getMessage());
	        }
	    }
	}
