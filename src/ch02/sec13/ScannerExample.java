package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
//		while(true) {
//			System.out.print("x 값 입력: ");
//			String strX = scanner.nextLine(); // 키보드로 입력 받은 값을 strX에 저장
//			int x = Integer.parseInt(strX); // 문자열을 정수로 변경해서 저장
//			
//			System.out.print("y 값 입력: ");
//			String strY = scanner.nextLine();
//			int y = Integer.parseInt(strY);
//			
//			int result = x + y;
//			System.out.println("x + y: " + result);
//		}
		
		while(true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
	}
}
