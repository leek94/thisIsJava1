package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {

//		인터페이스 변수 선언
		RemoteControl rc = null;

//		인터페이스 사용할 객체 연결
//		rc = new Television();
		rc = new Audio();

		rc.turnOn();
		rc.setVolume(5);

		rc.setMute(true); // 객체가 있어야만 사용할 수 있다 -> 객체 소속이다. 인터페이스에 정의됨
		rc.setMute(false);
		rc.turnOff();

	}
}
