package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {

		byte byteValue = 10;
		int intValue = byteValue; // 값은 동일하나 바이트 타입이 다름 4 : 1 -> 자동 형변환
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; // 바이트 타입이 4 : 2 -> 자동 형변환
		System.out.println(intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println(longValue); // 바이트 타입이 8 : 4 -> 자동 형변환
		
		longValue = 100;
		float floatValue = longValue; // 바이트 타입은 4 : 8 인데 저장 방식이 실수가 더많이 저장이되서 가능 -> 자동형변환
		System.out.println(floatValue); // 실수로 저장되서 .0 이 붙는다
		
		floatValue = 100.5f; // 실수 타입은 f를 안붙이면 8byte로 알기 때문에 f 안붙이면 에러남
							 // 작은 바이트에 큰 바이트를 넣으려고하면 강제 형변환 해줘야함
		double doubleValue = floatValue;
		System.out.println(doubleValue);
		
		int a = 10;
		int b = 10; // 변수를 선언하면 생성되는 메모리 번지수는 다르다
//		char chattValue = byteValue; // 에러 발생
	}

}