package ch06.sec13.exam03.package1;

public class A {
	//Field 선언
	public int field1;
	int field2;
	private int field3;
	
	//Constructor 선언
	
	public A(){
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3(); //-> 같은 클래스 내에서는 접근 제한 없음
	}
	
	
	// Method 선언
	public void method1() {}
	void method2() {}
	private void method3() {}
	
}
