package ch14.sec03.exam02;

public class BeepPrintExample {

	public static void main(String[] args) {
		// main Thread가 실행 주체 밑으로 가면서 실행함
		
		//작업 1 --------------------------------------
		Thread thread = new MusicThread(); // 자식은 부모 객체 변수에 담을 수 있다
		thread.start();
		
		// -------------------------------------------

		
		//작업 2 ---------------------------------------
		for (int i = 0; i < 5; i++) {
			// Thread가 작업할 내용
			System.out.println("가사를 출력합니다.");
			
			// 1초간 일시 정지
			try {
				Thread.sleep(1000);// 1/1000 초 단위
			} catch (InterruptedException e) {
				
				e.printStackTrace(); // 예외 정보 출력
			} 
		}
	}

}
