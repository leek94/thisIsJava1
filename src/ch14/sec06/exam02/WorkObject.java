package ch14.sec06.exam02;

public class WorkObject {

	public synchronized void methodA() { // 한번에 하나의 스레드만 사용할 수 있게 -> synchronized
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodA 작업 실행");
		
		// 상대방을 깨운다(실행 대기 상태로 만듬)
		notify();
		// 자기 자신은 일시 정지
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}

	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodB 작업 실행");
		
		// 상대방을 깨운다(실행 대기 상태로 만듬)
		notify();
		// 자기 자신은 일시 정지
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	// 스레드 A가 methodA를 실행하는 동안에 스레드 B가 methodB를 실행하지 못함

}
