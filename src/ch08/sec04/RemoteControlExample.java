package ch08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {

		//인터페이스 변수 선언
		//인터페이스 사용할 객체 연결
//		RemoteControl rc;
//		rc = new Television();
//		rc = new Audio();
//		
//		rc.turnOn();
//		rc.setVolume(5);
//		rc.turnOff();
		//-> Television을 사용하지 않고 Remote Control만 사용하고 있다.
		// 인터페이스를 통해서 사용하고 있다는 의미
		
		use(new Television());
		use(new Audio());
	}

	public static void use(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
	}
}
