package ch07.sec02.exam02;

public class Phone {

	//Field 선언
	public String model;
	public String color;
	
	//Construct 선언
	public Phone(String model, String color){
		System.out.println("Phone 생성자 실행");
		this.color = color;
		this.model = model;
	}	
	//Method 선언
	public void bell() {
		System.out.println("벨이 울립니다");
	}
	
	public void sendVoice(String message) {
		System.out.println("자기: " + message);
	}
	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	public void hangUp(){
		System.out.println("전화를 끊습니다");
	}
	
}
