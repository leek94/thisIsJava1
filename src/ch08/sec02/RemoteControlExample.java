package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		
//		// 리모컨 변수 선언
//		RemoteControl rc;
//		
//		// 리모컨과 연결된 객체 대입
////		rc = new Television();
//		rc = new Audio();
//		
//		//리모컨을 통해서 TV의 전원을 켬
//		rc.turnOn(); // 구현객체의 재정의된 내용 출력
		
		
		use(new Television()); //메소드의 매개변수가 인터페이스 타입인 경우로 많이 사용
		use(new Audio()); 
	
	}

	public static void use(RemoteControl rc) { // Parent도 대입 가능하고 Child도 대입 가능
		rc.turnOn();							// 인터페이스에 대입될 수 객체 올 수 있음
												// 텔=레비전, 오디오거 실행됨
		
		
	}
}
