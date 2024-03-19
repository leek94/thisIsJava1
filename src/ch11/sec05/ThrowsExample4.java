package ch11.sec05;

import java.io.*;

public class ThrowsExample4 {
	// TODO: 예외를 다르게 처리하려고 할떄
	public static String method1() {
		try {
			method();
			return "바라보다";
		} catch (FileNotFoundException e) {
			System.out.println("여기서 FileNotFoundException을 잡음");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("여기서 IOException을 잡음");
			e.printStackTrace();
		}
		return null;
	} // 두가지 기능으로 나눠서 자세하게 처리

	public static void method2() {
		try {
			method();
		} catch (Exception e) {
			System.out.println("여기서 FileNotFoundException을 잡음");
			e.printStackTrace();
		}
	} // 한번에 처리해버림 
	// 메서드 호출시 다양하게 처리를 하고 싶으면 이렇게 throws를 자세하게 던지고 받아서 처리하면 됨

	public static void method() throws IOException, FileNotFoundException {
		// fis.read 예외 던짐, IOException, FileNotFoundException 구체적으로 처리하려면 두개 다 던짐
		// IOException안에 FileNotFoundException가 있음
		FileInputStream fis = null;

		fis = new FileInputStream("C:/Temp/a.txt");

		fis.read();
		fis.close();
	}

}
