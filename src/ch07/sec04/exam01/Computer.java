package ch07.sec04.exam01;

public class Computer extends Calculator {

	//Field 선언
	
	//Construct 선언
	
	//method 선언
	//메소드 오버라이딩 -> 실수 방지
	@Override
	public double areaCircle(double r) {

		return Math.PI*r*r;
	}
}
