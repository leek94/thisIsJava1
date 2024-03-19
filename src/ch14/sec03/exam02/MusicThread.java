package ch14.sec03.exam02;

public class MusicThread extends Thread{

	// run() 추상 메서드라 꼭 재정의 필요
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			// Thread가 작업할 내용
			System.out.println("노래를 재생합니다.");
			
			// 1초간 일시 정지
			try {
				Thread.sleep(1000);// 1/1000 초 단위
			} catch (InterruptedException e) {
				
				e.printStackTrace(); // 예외 정보 출력
			} 
		}
	}
	

}
