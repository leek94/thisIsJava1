package ch18.sec02.exam02;

import java.io.*;

public class WriteExample {

	public static void main(String[] args) {

		try {
			//데이터 도착지를 test2.db 파일로 하는 바이트 출력 스트림 생성
			OutputStream os = new FileOutputStream("C:/Temp/test2.db");

			byte[] array = { 10, 20, 30 };
			
			os.write(array); // 배열의 모든 바이트를 출력
			
			os.flush(); // 내부 버퍼 출력
			os.close(); // 출력 스트림 닫음
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
