package ch06.sec14;

public class CarChild extends Car{
	CarChild(int speed) { //초기값 등록
		super(speed);
	}
	public static void main(String[] args) {
		CarChild carChild = new CarChild(10);
		System.out.println(carChild.getSpeed());
		carChild.setSpeed(20);
		System.out.println(carChild.getSpeed());
	}

}
