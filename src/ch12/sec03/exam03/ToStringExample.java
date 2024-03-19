package ch12.sec03.exam03;

public class ToStringExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
		System.out.println(myPhone.toString());
		
		String info = "나의 폰은" + myPhone; // String과 객체가 오면 객체의 
										   //toString()의 리턴값이 나온다
		String info1 = "나의 폰은" + myPhone.toString();
 	
		System.out.println(info1);
		System.out.println(info);
		
		
		
	}

}
