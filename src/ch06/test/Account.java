package ch06.test;

public class Account {
	//Field 선언
	private int balance; //객체 마다 잔고를 가지고 있어야해서 static 못씀 
					    //static이면 모든 사람이 같은 잔고를 가지고 있음
	private static Account instance = new Account();
	
	//Contstruct 선언
	private Account(){
		
	}
	
	//Method 선언
	public void input(int amount) {
		balance += amount;
	}

	public void output(int amount) {
		balance -= amount;
	}
	
	public static Account getInstance() {
		return instance;
	}
	
	public int getBalance() {
		return balance;
	}
}
