package ch11.sec06;

public class Account {
	//Field 선언
	private long balance;
	
	//Construct 선언
	public Account() {}

	//Method 선언
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) throws InSufficientException {
		if(balance < amount) {
			throw new InSufficientException("잔고 부족: " + (amount-balance) + " 모자람");
		}// 예외가 발생할 경우 밑에 코드는 실행 안하고
		 // 예외 처리가 된다
		balance -= amount;
	}
	
	
}
