package ch14.sec06.exam02;

public class ThreadB extends Thread{
	private WorkObject workObject;
	
	// 생성자 주입 -> 생성자를 통해서 외부 객체를 주입
	public ThreadB(WorkObject workObject) { 
		setName("ThreadB");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i =0; i < 100000; i++) {
			workObject.methodB();
		}
	}

}
