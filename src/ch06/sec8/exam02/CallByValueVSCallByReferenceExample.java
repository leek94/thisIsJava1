package ch06.sec8.exam02;

public class CallByValueVSCallByReferenceExample {

	public static void main(String[] args) {
		
		int value1 = 1; // 기본타입 - 값 저장
		int[] value2 = {1}; // 참조타입 - 번지 저장
		
		callByValue(value1); //메서드로 이동
		System.out.println("value : " + value1);
		
		callByReference(value2); //메서드로 이동
		System.out.println("value2[0] : " + value2[0]);
		
		Member member = new Member("홍길동");
		System.out.println("name: " + member.name);
		
		callByReference(member);
		System.out.println("name: " + member.name);
	}
	public static void callByValue(int arg) {
		arg = 2;
	}
	
	public static void callByReference(int[] arg) {
		arg[0] = 2;
	}
	
	public static void callByReference(Member arg) {
		// 같은 이름에 매개변수만 다른 타입 -> 메소드 오버로딩
		arg.name = "감자바";
	}
	// 기본타입은 변수의 값 전달 시 값 복사가 일어남
	// 참조타입은 변수의 값 전달 시 번지 복사가 일어남
}
