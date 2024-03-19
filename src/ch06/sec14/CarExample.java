package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car(10);
		
		myCar.setSpeed(-50);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		if(!myCar.isStop()) { // 차가 움직이고 있다면 
			myCar.setStop(true); // 멈추겠다
		}
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}

}
