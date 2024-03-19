package ch14.sec03.exam01;

public class BeepPrintExample {

	public static void main(String[] args) {
		// main Thread가 실행 주체 밑으로 가면서 실행함
		
		
		
		//작업 1 --------------------------------------
		Runnable runnable = new MusicTask(); // 작업 객체 생성후
		Thread thread = new Thread(runnable);
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
