package ch04.sec02;

public class IfDiceExample {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 6); // 실수를 정수로 변경해서 0 ~ 5 까지 값이 나옴
		// 5.9도 5로 나오기 때문에 +1를 해서 1~6까지 나오게 해줌
		System.out.println(num);
		
		if(num ==1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num == 4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num == 5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}
	}

}
