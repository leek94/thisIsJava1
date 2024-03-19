package ch06.test;

public class BankExample {

	public static void main(String[] args) {
		
		Bank bank1 = new Bank("서울"); // 은행은 여러개 서울점
		bank1.deposit(10000);
		
		Bank bank2 = new Bank("대전"); // 은행은 여러개 대전점
		bank2.withdraw(3000);
		
		bank1.balanceInfo();
		bank2.balanceInfo();
		
		
	}

}
