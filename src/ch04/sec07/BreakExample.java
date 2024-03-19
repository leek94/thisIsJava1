package ch04.sec07;

public class BreakExample {

	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) {
				break; // break 문은 if문을 종료하는게아니고 반복문 while문을 종료
			}
		}
		System.out.println("프로그램 종료");
	}

}