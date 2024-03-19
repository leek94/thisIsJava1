package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// 정밀도 확인
		// 실수 리터럴은 컴파일러가 8byte로 인식을하는데 
		float v1 = 0.1234567890123456789f; // float는 f, F 대소문자를 붙여주면 8byte가 아니고 4byte로 인식함
		double v2 = 0.1234567890123456789;
		
		System.out.println(v1); // 0.12345679
		System.out.println(v2); // 0.12345678901234568
		
//		int v3 = 100000000000; // 4 byte인 int는 1000억 저장 불가능
		float vv3 = 100000000000f; // 4 byte인 float는 1000 억 저장 가능
		// int는 이진수로 값을 저장, float 가수와 지수로의 값으로 저장 (m * 10^x)
		
//		double v4 = 100000000000; // 리터럴 값의 경우 정수는 int로 인식하기 때문에 L을 붙여야 함
		double vv4 = 100000000000L;
		float vv5 = 1000000000000L;
	}
}