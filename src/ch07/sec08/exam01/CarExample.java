package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		car.tire = new HankookTire(); // 카의 tire 자리에 대입
//		car.tire = new KumhoTire(); // 카의 tire 자리에 대입
		car.run();
	}

}
