package ch06.test;

public class Bank {

	//Field 선언
	private String branch;
	
	
	//Construct 선언
	
	public Bank(String branch) {
		this.branch = branch;
	}
	
	//Method 선언
	public void deposit(int amount) {
		Account account = Account.getInstance();
		account.input(amount);
	}
	
	public void withdraw(int amount) {
		Account account = Account.getInstance();
		account.output(amount);
	}
	
	public void balanceInfo() {
		Account account = Account.getInstance();
		System.out.println(account.getBalance());
	}
}
