package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
		byte result1 = 10 + 20; // byte 리터럴 값의 연산시 컴파일 할때 수행되기 때문에 byte result1 = 30;과 같음
		byte v1 = 10;
		byte v2 = 20;
	    int result2 = v1 + v2; // byte 타입 변수 연산시 int로 변환 후 연산하기 때문에 결과 값이 int여야함
	    System.out.println(result2);
	    
	    byte v3 = 10;
	    int v4 = 100;
	    long v5 = 1000L;
	    long result3 = v3 + v4 + v5; // long 타입으로 변환됨
	    System.out.println(result3);
	    
	    char v6 = 'A';
	    char v7 = 1;
	    int result4 = v6 + v7; // char도 연산시 int로 변환됨
	    System.out.println((char)result4);
	    
	    int v8 = 10;
	    int result5 = v8/4; // int의 연산은 결과 값이 int임 그래서 2 만 저장됨
	    System.out.println(result5);
	    
	    int v9 = 10;
	    double result6 = v9/4.0; // 실수와 정수 변수의 연산은 실수로 변경되어 연산
	    System.out.println(result6);
	    
	    int v10 = 1;
	    int v11 = 2;
	    double result7 = (double) v10/v11; // 강제 형변환을 하고 연산하면 연산시 double로 변경되어 연산됨
	    System.out.println(result7);
	    
	    
	}

}
