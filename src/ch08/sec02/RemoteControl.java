package ch08.sec02;

public interface RemoteControl {
	//public 추상 메서드
	public void turnOn();
	public void turnOff();
	// 구체적인 결정이 정해지지 않아서 추상메서드로 구현을 한다 -> abstract를 생략 가능
}
