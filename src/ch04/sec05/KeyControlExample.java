package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean run = true;
		int speed = 0;

		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-----------------------------------");
			System.out.print("선택: ");

			String strNum = scanner.nextLine();

			if (strNum.equals("1")) {
				speed++;
				System.out.println("현재속도 = " + speed);
			} else if (strNum.equals("2")) {
				if (speed > 0) {
					speed--;
					System.out.println("현재속도 = " + speed);
				} else {
					System.out.println("이미 정지 상태입니다.");
				}

			} else if (strNum.equals("3")) {
				System.out.println("운행을 중지합니다.");
//			break;
				run = false;
			} else {
				System.out.println("정확한 값을 입력하세요.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}