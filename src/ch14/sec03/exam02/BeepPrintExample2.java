package ch14.sec03.exam02;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// main Thread가 실행 주체 밑으로 가면서 실행함

		Thread thread = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					Thread curThread = Thread.currentThread();
					// Thread가 작업할 내용
					System.out.println("노래를 재생합니다: " +curThread.getName() );

					// 1초간 일시 정지
					try {
						Thread.sleep(1000);// 1/1000 초 단위
					} catch (InterruptedException e) {

						e.printStackTrace(); // 예외 정보 출력
					}
				}
			}
		};
		thread.start();

		// -------------------------------------------

		// 작업 2 ---------------------------------------
		for (int i = 0; i < 5; i++) {
			Thread curThread = Thread.currentThread();
			
			
			
			// Thread가 작업할 내용
			System.out.println("가사를 출력합니다.: " + curThread.getName());

			// 1초간 일시 정지
			try {
				Thread.sleep(1000);// 1/1000 초 단위
			} catch (InterruptedException e) {

				e.printStackTrace(); // 예외 정보 출력
			}
		}
	}

}
