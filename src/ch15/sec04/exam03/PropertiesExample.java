package ch15.sec04.exam03;

import java.io.*;
import java.util.*;

public class PropertiesExample {

	public static void main(String[] args) {
		
		
		
//		PropertiesExample pe = new PropertiesExample();
//		Class clazz1 = pe.getClass(); // 객체가 있을 때 사용
//		// 위아래 같은 의미-> 같은 번지값 리턴
//		Class clazz2 = PropertiesExample.class; // 객체 없이 사용
		
		Properties prop = new Properties();
		
		try { // 파일 내용 읽는 스트림 객체
			prop.load(PropertiesExample.class.getResourceAsStream("database.properties"));
			//PropertiesExample.class 위치에서 부터 (기준으로)
			// getResourceAsStream -> inputStream을 이용해서
			//"database.properties를 찾아 읽어라
		} catch (IOException e) {
		}
		
		String userName = prop.getProperty("username");
		String password = prop.getProperty("password");
		System.out.println(userName + " : " + password);
	}

}
