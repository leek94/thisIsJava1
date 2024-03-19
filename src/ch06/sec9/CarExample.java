package ch06.sec9;

public class CarExample {

	public static void main(String[] args) {
		
		System.out.println(Car.company);
		Car.info();
		
		Car myCar = new Car("G80");
		myCar.setSpeed(100);
		
		System.out.println(myCar.model);
		System.out.println(myCar.speed);
		
		myCar.run();
		
		System.out.println(myCar.company); //실행은 되지만 사용을 권장하지 않는 표현 -> 정적 멤버를 객체를 통해 호출
		myCar.info(); //실행은 되지만 사용을 권장하지 않는 표현 -> 정적 멤버를 객체를 통해 호출
		
	}
}