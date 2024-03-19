package ch11.sec05;

import java.io.*;

public class ThrowsExample3 {

	public static void main(String[] args) {
		try {
			method();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void method() throws IOException, FileNotFoundException { 
		// fis.read 예외 던짐, IOException, FileNotFoundException 구체적으로 처리하려면 두개 다 던짐
		// IOException안에 FileNotFoundException가 있음
		FileInputStream fis = null;

		fis = new FileInputStream("C:/Temp/a.txt");

		fis.read();
		fis.close();
	}

}
