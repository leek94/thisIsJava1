package ch11.sec02.exam02;

public class ExceptionHandlingExample { // 일반 예외
	public static void main(String[] args) {

		try {
			Class.forName("java.lang.String");
			System.out.println("해당 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		}

	}
}