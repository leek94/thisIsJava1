package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
//		long var3 = 10000000000; // 컴파일러는 21억 이상의 값은 L을 붙이지 않으면 int로 간주하기 때문에 에러
		long var4 = 10000000000l; // L , l 대소문자 다 가능
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);


	}

}
