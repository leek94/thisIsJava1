package ch04.test;

public class WhileMath {

	public static void main(String[] args) {
		
		
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			
			if(num + num2 == 5) {
				System.out.println("num 값: "+ num + " ||  num2 값: " + num2);
				System.out.println(" 두 수의 합이 5입니다");
				break;
			}
			
			System.out.println("num 값: "+ num + " ||  num2 값: " + num2);
		}
	}

}
