package ch14.sec05.exam03;

public class YieldExample {

	public static void main(String[] args) {
		// 생성자에서 Thread 이름 설정
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");

		workThreadA.start();
		workThreadB.start();

		try {
			Thread.sleep(5000);// main 5초간 일시정지
		} catch (InterruptedException e) {
		}

		workThreadA.work = false;

		try {
			Thread.sleep(10000);// main 10초간 일시정지
		} catch (InterruptedException e) {
		}

		workThreadA.work = true;
	}

}