package ch06.sec9;

public class Car {
	//Field 선언
	static String company = "현대자동차"; // 모든 값이 같을 경우 정적 멤버로
	String model; // 객체 마다 값이 달라질 경우 인스턴스로
	int speed;
	
	//Constructor 선언
	Car(String model){
		this.model = model; // 우선순위가 필드 값보다 매개변수가 높음 -> this 붙여야함
	}
	//Method 선언
	static void info() { // 객체가 없이도 사용 가능함
		System.out.println(company + "가 설계한 자동차");
		
		//this.model = "그랜저"; // static 객체가 없어도 실행할 수 있는 메소드에서
							   //객체를 사용해야 사용할 수 있는 인스턴스 필드를 사용할 수없음
		
		}
	void setSpeed (int speed) {
		this.speed = speed;
	}
	
	void run() {
		setSpeed(100); // 인스턴스 메서드에서 인스턴스 메서드를 호출하는건 가능 상관없음
		System.out.println(model + "가 달립니다.(시속: " + speed + "km/h)");
	} // this.model을 model로 사용해도됨 -> 매개변수가 없기 때문
		// this.을 적는 이유는 '객체'가 가지고 있는 필드임을 강조하기 위해
	// 정적메서드로 선언된 메서드에서 인스턴스 메서드를 사용할 수 없음. 정적 메서드는 호출 가능
}
