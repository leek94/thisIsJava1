package ch06.sec10.exam01;

public class Calculator {
	// 불변의 값의 성질을 가지는 값은 static으로 정리하는게 좋음
	static double pi = 3.14159;
	String color;
	
	// 객체 마다 가질 필요가 없는 필드일 경우 static을 붙여줌
	
	//인스턴스 맴버(필드, 메소드)를 사용하지 않는 메소드라면 static을 붙여주는게 관례임
	static int plus(int x, int y) {
		//color = "흰색"; // 정적 멤버에서 인스턴스 필드를 사용할 수 없음
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
}
