package ch06.sec6.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		//Car 객체 생성
		Car myCar = new Car(); // 객체의 생성자를 통해 번지를 리턴함
		
		//Car 객체의 필드값 변경
		myCar.model = "그랜다이저";
		myCar.start = true;
		myCar.speed = 60;
		
		//Car 객체의 필드 값
		System.out.println("모델명: " + myCar.model);
		System.out.println("시동 여부: " + myCar.start);
		System.out.println("현재 속도: " + myCar.speed);
		System.out.println();
		//Car 객체를 생성
		Car yourCar = new Car();
		//Car 객체 내부의 데이터 읽기
		System.out.println("모델명: " + yourCar.model);
		System.out.println("시동 여부: " + yourCar.start);
		System.out.println("현재 속도: " + yourCar.speed);
	}

}
