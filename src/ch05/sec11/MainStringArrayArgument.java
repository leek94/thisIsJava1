package ch05.sec11;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		
		if(args.length !=2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0); // 정상 종료 하라는 의미 -> JVM을 종료시켜라(프로그램을 종료시켜라)
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		System.out.println(strNum1);
		System.out.println(strNum2);
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " +  result);
	}

}
