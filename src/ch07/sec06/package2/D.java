package ch07.sec06.package2;

import ch07.sec06.package1.*;

public class D extends A{
	
	public void method1() { // 상속을 했기 때문에 객체 만들지 않고 사용 가능

		field = "value";
		method();
		
	}
}
