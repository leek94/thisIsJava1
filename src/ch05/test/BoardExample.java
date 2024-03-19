package ch05.test;

import java.util.Scanner;

public class BoardExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int select = 0;
		String[][] board = new String[100][4];
		int num = 0;
		int index = 0;

		while (true) {
			System.out.println("----------------------------------------");
			System.out.println("번호\t제목\t\t\t글쓴이");
			System.out.println("----------------------------------------");
			// TODO: 요약 페이지 값 보여야 함
			for (int j = board.length-1; j >= 0 ; j--) {
				if( board[j][0] != null) {
	 			System.out.println(board[j][0]+"\t" + board[j][1] +"\t\t\t" + board[j][3]);
				}
			}
			
			System.out.println("----------------------------------------");
			System.out.println("메뉴: 1.생성|2.보기|3.수정|4.삭제|5.종료");
			System.out.print("선택: ");

			select = Integer.parseInt(scanner.nextLine());
			if (select == 1) {
				System.out.println("[새글쓰기]");
				System.out.print("제목: ");
				board[index][1] = scanner.nextLine();
				System.out.print("글쓴이: ");
				board[index][3] = scanner.nextLine();
				System.out.print("내용: ");
				board[index][2] = scanner.nextLine();

				board[index][0] = String.valueOf((++index));

			} else if (select == 2) {
				System.out.print("게시물번호: ");
				num = Integer.parseInt(scanner.nextLine());
				System.out.println("[글 보기]");
				System.out.println();
				System.out.println("번호: " + board[num-1][0]);
				System.out.println("제목: " + board[num-1][1]);
				System.out.println("글쓴이: " + board[num-1][3]);
				System.out.println("내용: " + board[num-1][2]);
				
			} else if (select == 3) {
				System.out.print("게시물번호: ");
				num = Integer.parseInt(scanner.nextLine());
				System.out.println();
				
				System.out.println("[글 수정]");
				System.out.print("제목: ");
				board[num-1][1] = scanner.nextLine();
				System.out.print("내용: ");
				board[num-1][2] = scanner.nextLine();
				
			} else if (select == 4) {
				System.out.print("게시물번호: ");
				num = Integer.parseInt(scanner.nextLine());
				System.out.println();
				
				for(int i = 0; i<board[num-1].length; i++) {
					board[num-1][i] = null;
				}
				
			} else if (select == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
				
			}
		}

	}
}
