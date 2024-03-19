package ch06.sec10.exam03;

public class Car {
	//Field 선언
			int speed;
			
			//Construct 선언
			void run() {
				System.out.println(speed+"으로 달립니다.");
			}
			//Method 선언
			static void simulate() {
				//객체 생성
				Car myCar = new Car();
				//인스턴스 멤버 사용
				myCar.speed = 200;
				myCar.run();
				
			}
			

	public static void main(String[] args) {
		//정적 메소드 호출
		simulate(); // 같은 클래스내에 있때는 클래스명 생략 가능
//		Car.simulate(); -> 가능
		
		//객체 생성
		Car myCar = new Car();
		//인스턴스 멤버 사용
		myCar.speed = 60;
		myCar.run();
	}

}