package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
	//Field 선언
	A a = new A();
	//Contruct 선언
	public C() {
		a.field1 = 1;
//		a.field2 = 1; --> 같은 패키지 안에서만 사용 가능
//		a.field3 = 1; --> 같은 클래스 안에서만 사용 가능
		
		a.method1();
//		a.method2(); --> 같은 패키지 안에서만 사용 가능
//		a.method3(); --> 같은 클래스 안에서만 사용 가능
	}
}
