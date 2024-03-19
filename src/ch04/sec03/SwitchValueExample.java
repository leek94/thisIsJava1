package ch04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {

		String grade = "C";
		
		// 자바 11 이전 문법
		int score1 = 0;
		switch(grade) {
		case "A":
			score1 = 100;
			break;
		case "B":
			int result = 100 - 20;
			score1 = result;
			break;
		default:
			score1 = 60;
		}
		
		System.out.println("score1: " + score1);
		
		// 자바 13부터 가능
		int score2 = switch(grade) { // switch 문으로 나오는 결과 값을 변수에 넣을 수 있음
		case "A" -> 100;
		case "B" -> { // 중괄호를 사용할 경우에는 yield로 결과값을 지정해줘야함
					  // 단 yield를 사용할 경우 밑에 default 값이 필수임
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		}; // 여기서 ;는 int score2 = 60; 이러식으로 찍히는 ; 세미콜론임
		System.out.println("score2: " + score2);
	}
	
}

