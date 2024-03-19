package ch07.sec10.exam01;

public abstract class MobilePhone { // abstract를 붙여서 추상 클래스로 지정
	
	public String owner;
	
	public MobilePhone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}

	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
	
	public abstract void internetSeach(); // 추상메서드로 만들어서 내용을 적지 않는다.

	
}
