package ch08.sec11.exam01;

public class CarExample {

	public static void main(String[] args) {

		// 자동차 객체 생성
		Car mycar = new Car();
		
		// 자동차 달리게 합니다
		mycar.run();
		
		 //타이어 교체
		mycar.tire1 = new KumhoTire();
		
		mycar.run();
	}

}
