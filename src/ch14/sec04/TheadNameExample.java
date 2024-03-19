package ch14.sec04;

public class TheadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행");
		
		for(int i =0; i<3; i++) {
			Thread threadA = new Thread() {
				
				@Override
				public void run() {
					System.out.println(getName() + " 실행");
					// getName()
				}
			};
			threadA.start();
		}
		
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + " 실행1");
			}
		};
		chatThread.setName("chat-thread"); 
		// start 전에만 이름 설정하면 스레드명 변경됨 (위에서) 
		chatThread.start();
	}

}
