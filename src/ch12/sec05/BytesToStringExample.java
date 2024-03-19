package ch12.sec05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class BytesToStringExample {

	public static void main(String[] args) {
		String data = "자바";
		
		//String -> byte배열
		
		try {
			byte[] arr1 = data.getBytes("UTF-8"); // 문자를 바이트로 변경 -> 문자셋 UTF-*
//			System.out.println(arr1); // arr1만 사용하면 Object.toString()이 호출되서 의미 없는값 나옴
			System.out.println("arr1: " + Arrays.toString(arr1));
			
			String recoveredData = new String(arr1, "UTF-8"); // 문자로 복원 문자셋 UTF-8
			System.out.println(recoveredData);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
