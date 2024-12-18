
/*
 * C:\\Windows\\system.ini 을 복사해서
 * C:\\Temp\\system.txt 로 만들어 주세요
 * 단, 문자 기반 스트림을 사용하세요
 */

package com.trump.day16.stream.exception.exercise;

import java.io.*;

public class Exercise_TextFileCopy {
    public static void main(String[] args) {
        // 원본 파일 경로와 복사할 파일 경로 정의
        String sourcePath = "C:\\Windows\\system.ini";
        String targetPath = "C:\\Temp\\system.txt";

        // 파일 복사 작업 수행
        try (
            FileReader fileReader = new FileReader(sourcePath);
            FileWriter fileWriter = new FileWriter(targetPath)
        ) {
            // 문자 데이터를 읽고 쓰기 위한 버퍼
            char[] buffer = new char[1024];
            int bytesRead;

            // 파일 내용을 읽어서 복사
            while ((bytesRead = fileReader.read(buffer)) != -1) {
                fileWriter.write(buffer, 0, bytesRead);
            }

            System.out.println("파일 복사가 완료되었습니다: " + targetPath);
        } catch (FileNotFoundException e) {
            System.err.println("원본 파일을 찾을 수 없습니다: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("파일 처리 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}

