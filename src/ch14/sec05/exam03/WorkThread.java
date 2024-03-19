package ch14.sec05.exam03;

public class WorkThread extends Thread {

	// Field 선언
	public boolean work = true;

	// Construct 선언
	public WorkThread(String name) {
		setName(name); // Thread를 상속 받았기 때문에 Thread 이름 설정
	}

	// Method 선언
	@Override
	public void run() {
		while (true) {
			if (work) {
				System.out.println(getName() + ": 작업처리");
			}else {
				Thread.yield(); // 실행 대기 상태로 빼버림 -> 무의미한 반복 X
			}

		}

	}

}
