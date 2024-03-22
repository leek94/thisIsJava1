package ch18.sec06;

import java.io.*;

public class CharcterConvertStreamExample {

	public static void main(String[] args) {
		try {
			write("문자 변환 스트림을 사용합니다.");
			String data = read();
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void write(String str) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		// OutputStream을 통해서 바이트로 문자 값을 받음
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		// 바이트 형 입력을 문자형 입력으로 변경해줌 / UTF-8 글자당 3byte임을 알려줘야함
		// EUCkr은 2byte다
		writer.write(str); //writer 스트림이 가지고 있는 write() 메서드
		writer.flush();
		writer.close();
	}

	public static String read() throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		String str = new String(data, 0, num);
		return str;
	}

}
