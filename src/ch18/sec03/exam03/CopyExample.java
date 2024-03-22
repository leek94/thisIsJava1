package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {

	public static void main(String[] args) throws Exception{
		
		String originalFileName = "C:/Temp/test.jpg";
		String targetFileName = "C:/Temp/test2.jpg";
		
		//입출력 스트림
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os  = new FileOutputStream(targetFileName);
	
	
		byte[] data = new byte[1024]; // 읽은 바이트를 저장항 배열 생성 1024 바이트로
		while(true) {
			int num = is.read(data); // 최대 1024 바이트 읽고 배열에 저장, 읽은 바이트 리턴
			if(num == -1 ) break;// 파일 다 읽으면 while문 종료
			os.write(data, 0 ,num); // 읽은 바이트 수만큼 출력
		}
		
		os.flush(); // 내부 버퍼 잔류 바이트를 출력하고 버퍼를 비움
		os.close();
		is.close();
	}

}
