package ch14.sec06.exam01;

public class SynchronizedExample {

	public static void main(String[] args) {
		
		// 공유 갹채 생성
		Calculator calculator = new  Calculator();
		
		
		// 공유 객체를 User1Thread에 주입
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator); 
		// 새터 주입 -> 외부에서 객체 생성해서 필드에 저장
		
		
		// 공유 객체를 User2Thread에 주입
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);
		
		//User1Thread가 계산기를 먼저 사용
		user1Thread.start(); // run() 메서드 실행
		//User2Thread가 계산기를 나중에 사용
		user2Thread.start();
		
	}

}
