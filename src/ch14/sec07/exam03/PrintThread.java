package ch14.sec07.exam03;

public class PrintThread extends Thread {

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("실행 중");
				if(Thread.interrupted()) {
					break;
				}
			}

		} catch (Exception e) { // 예외 발생시 while문 빠져 나감
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
