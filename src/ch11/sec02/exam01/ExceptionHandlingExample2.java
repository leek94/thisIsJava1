package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	public static void printLengths(String data) { // String 자식이거나 자식 객체가 올 수있다
		try {						   // 그러나 String은 final 객체라 자식 없음
			
			int result = data.length();	
			System.out.println("문자 수: " + result);
			
		} catch(NullPointerException e) { // 발생된 예외 객체가 대입 -> 널포인트 객체가 대입
			System.out.println(e.getMessage()); // e가 참조하여 가지고있는 getMessage()를 호출
			// getMessage()는 예외가 왜 발생했는지 이유 리턴해줌
			System.out.println("---------------");
			System.out.println(e.toString()); // e.getMessage보다 자세한 내용 예외의 종류까지 출력
			System.out.println("---------------");
			e.printStackTrace(); // 예외가 어디서 부터 발생했는지 까지 출력
		} finally {
			System.out.println("마무리 실행");
		}
						
		
	}

	public static void main(String[] args) {

		System.out.println("프로그램 시작");

		printLengths("ThisIsJava"); // 예외 발생 안함 try 블록만 지나서 실행됨
		System.out.println();
		
		printLengths(null); // 예외 발생으로 try catch문에 걸려서 문자열이 없습니다 출력

		System.out.println("시스템 종료");
	}

}
;