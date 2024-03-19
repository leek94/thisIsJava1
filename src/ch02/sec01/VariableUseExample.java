package ch02.sec01;

public class VariableUseExample {

	public static void main(String[] args) {
		
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour + "시간 " + minute + "분"); // 숫자 + 문자열은 문자열로 변경되어서 결합한다.
		System.out.println(hour + 10); // 숫자 + 숫자는 산술 연산
		
		int totalMinute =  minute + (hour * 60); // 코드는 왼쪽부터 연산을 하는데 그건 같은 연산자가 이용되었을때
											   // 연산자가 다른 경우에는 우선 연산자가 먼저 실행됨 그러니 연산자가 다를 경우 () 괄호를 사용해주는 게 좋음
		System.out.println("총 " + totalMinute + "분");
		
	}

}
