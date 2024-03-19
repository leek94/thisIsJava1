package ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		SumThread st = new SumThread();
		st.start();
		
		try {
			st.join(); // main 쓰레드가 SumThread가 끝날때 까지 대기 해줌
		}catch(InterruptedException e) {
			
		}
		
		System.out.println("1~100 합: " + st.getSum());
		// 값이 0이 나옴 이유는 SumThread가 실행 대기 상태에서 main 쓰레드가 실행이되어서
	}

}
