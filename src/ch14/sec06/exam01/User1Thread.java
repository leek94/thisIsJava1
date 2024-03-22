package ch14.sec06.exam01;

public class User1Thread extends Thread{
	//Field 선언
	private Calculator calculator; // 공유 객체를 저장
	
	public User1Thread(){
		setName("User1Thread");
	}	
	
	//Construct 선언
	
	//Method 선언
	public void setCalculator(Calculator calculator) { // 외부에서 공유 객체 받아서
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(100);
	}
	
	

}
