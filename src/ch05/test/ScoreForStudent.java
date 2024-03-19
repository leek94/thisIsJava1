package ch05.test;

import java.util.Scanner;

public class ScoreForStudent {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int scores = 0;
		int totalStudent = 0;
		int[] score = null;

		while (true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			String select = scanner.nextLine();

			if (select.equals("1")) { // 1번은 한번만 선택하는 경우로

				boolean run = true;
				while (run) {
					System.out.print("학생수> ");
					totalStudent = Integer.parseInt(scanner.nextLine());
					if (totalStudent <= 0) {
						System.out.println("학생의 수는 0보다 작을 수 없습니다.");
						System.out.println("학생 수를 다시 입력해주세요.");
					} else {
						run = false;
					}
				}

			} else if (select.equals("2")) {
				if (totalStudent == 0) {

					System.out.println("학생의 수를 먼저 입력 받으세요");
					continue;

				} else {

					score = new int[totalStudent];

					for (int i = 0; i < totalStudent; i++) {
						System.out.print("score[" + i + "]> ");

						scores = Integer.parseInt(scanner.nextLine());
						
						if(scores <0 || scores>100 ) {
							System.out.println("0~100까지 정확한 값을 입력하세요");
							i--;
							
						}else {
							score[i] = scores;							
						}
					}

				}
			} else if (select.equals("3")) {

				for (int i = 0; i < totalStudent; i++) {

					System.out.println("scores[" + i + "]: " + score[i]);
				}

			} else if (select.equals("4")) {

				int max = 0;
				int sum = 0;

				for (int i = 0; i < score.length; i++) {
					if (score[i] > max)
						max = score[i];
				}

				System.out.println("최고 점수: " + max);

				for (int i = 0; i < score.length; i++) {
					sum += score[i];
				}
				System.out.println("평균 점수: " + (double) sum / totalStudent);

			} else if (select.equals("5")) {

				System.out.println("프로그램 종료");
				break;
			} else {

				System.out.println("1~5까지 정확한 숫자를 입력하세요");
			}
		}
	}

}
