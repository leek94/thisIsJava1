package ch14.sec06.exam01;

public class Calculator {
	// Field 선언
	private int memory;

	public int getMemory() {
		return memory;
	}

	// Construct 선언

	// Method 선언
//	public synchronized void setMemory(int memory) {
//		this.memory = memory;
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//		}
//		System.out.println(Thread.currentThread().getName() 
//				+ " : " + this.memory);
//	}

	public void setMemory(int memory) {
		//멀티 스레드가 실행 가능
		synchronized (this) { // 여기는 1개의 스레드만 실행 가능
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		}
		//멀티 스레드가 실행 가능
		// 여기에 다른 코드가 있는 경우 이런 동기화 블록을 사용한다.
	}
}
