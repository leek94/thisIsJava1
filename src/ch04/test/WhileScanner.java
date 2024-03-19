package ch04.test;

import java.util.Scanner;

public class WhileScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int deposit = 0;
		int withdraw = 0;
		int balance = 0;

		while (true) {

			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");

			String str = scanner.nextLine();
			if (str.equals("1")) {
				System.out.print("입금액> ");
				deposit = Integer.parseInt(scanner.nextLine());
				balance += deposit;
			} else if (str.equals("2")) {
				System.out.print("출금액> ");
				withdraw = Integer.parseInt(scanner.nextLine());
				if (balance < withdraw) {
					System.out.println("잔고보다 원하는 출금액에 더 큽니다. 잔고를 확인해 주세요");
					continue;
				}
			} else if (str.equals("3")) {
				System.out.print("잔고> ");
				if (balance - withdraw < 0) {
					balance -= 0;
					System.out.println(balance);
					continue;
				}
				balance = balance - withdraw;
				System.out.println(balance);
			} else if (str.equals("4")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("1 ~ 4까지 정확한 숫자를 입력하세요 ");
			}
		}
	}

}
