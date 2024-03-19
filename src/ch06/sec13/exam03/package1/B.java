package ch06.sec13.exam03.package1;

public class B {
	
	A a = new A(); // A의 생성자가 private일 경우 에러 --> private 같은 클래스 내에서 사용 가능
	
	//Construct 선언
	public B() {
		a.field1 = 1;
		a.field2 = 1; // default 같은 패키지내에서 접근 가능
//		a.field3 = 1; --> private 여서 같은 패키지여도 접근 불가능
	
		a.method1();
		a.method2();
//		a.method3(); --> private 여서 같은 패키지여도 접근 불가능
		}
	
	//Method 선언
	
	
}
