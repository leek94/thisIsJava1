package ch12.sec06;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		//Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		System.out.println("value: " + obj); // 이렇게 적으면 obj가 String과 더해져서 String이 나옴
		System.out.println("value: " + obj.toString());// 위에 꺼랑 이건 String으로 리턴함
		System.out.println(obj);
		System.out.println(obj.toString());
		
		//UnBoxing
		int value = obj;
		System.out.println("value: " + value);
		
		//연산 시 Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
		
		
	}

}
