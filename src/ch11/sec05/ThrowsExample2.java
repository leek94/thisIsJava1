package ch11.sec05;

import java.io.*;

public class ThrowsExample2 {

	public static void main(String[] args) {
		
		
	}
	
	public static void method() throws IOException { // fis.read 예외 던짐
		FileInputStream fis = null;
		try {
			
			fis = new FileInputStream("C:/Temp/a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			fis.read();
		
	}


}
