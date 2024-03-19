package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
	public static void printLengths(String data) { // String 자식이거나 자식 객체가 올 수있다
		if(data != null) {						   // 그러나 String은 final 객체라 자식 없음
			int result = data.length();	
			System.out.println("문자 수: " + result);
		}
						
		
	}

	public static void main(String[] args) {

		System.out.println("프로그램 시작");

		printLengths("ThisIsJava");
		printLengths(null);

		System.out.println("시스템 종료");
	}

}
;