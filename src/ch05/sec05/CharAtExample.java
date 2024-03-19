package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		String ssn = "9506244230123";
		char sex = ssn.charAt(6);
		// 여기서 String 객체와 코드는 다른 영역에 있음
		// 그래서 메서드를 호출해서 리턴 값을 받는 것
		switch(sex) {
			case '1':
			case '2':
				System.out.println("남자입니다");
				break;
			case '3':
			case '4':
				System.out.println("여자입니다");
				break;
		}
	}
}