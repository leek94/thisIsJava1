//package ch06.practice.ex20;
//
//import java.util.Scanner;
//
//public class BankApplication {
//
//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//
//		Account[] accountList = new Account[100];
//
//		String num;
//		String accountNum;
//		String name;
//		int balance = 0;
//		int count = 0;
//		int checkNum = 0;
//		int newBalance = 0;
//
//		while (true) {
//
//			System.out.println("-----------------------------------");
//			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
//			System.out.println("-----------------------------------");
//			System.out.print("선택>");
//
//			num = scanner.nextLine();
//
//			if (num.equals("1")) { // 밸리데이션 체크 필요
//				System.out.println("------");
//				System.out.println("계좌생성");
//				System.out.println("------");
//
//				Account account = new Account();
//
//				
//				while(true) {
//					System.out.print("계좌번호: ");
//					accountNum = scanner.nextLine();
//					if (!accountNum.isEmpty()) {
//						account.setAccount(accountNum);
//						break;
//					} else {
//					    System.out.println("계좌번호를 정확히 입력하세요");
//					}
//				}
//				
//				
//				while(true) {
//					System.out.print("계좌주: ");
//					name = scanner.nextLine();
//					if (!name.isEmpty()) {
//						account.setName(name);
//						break;
//					} else {
//						System.out.println("이름을 정확히 입력하세요");
//					}
//					
//				}
//				
//
//				while(true) {
//					System.out.print("초기입금액: ");
//					String balanceElement = scanner.nextLine();
//					if (!balanceElement.isEmpty()) {
//					    balance = Integer.parseInt(balanceElement);
//					    account.setBalance(balance); 
//					    break;
//					} else {
//						System.out.println("금액을 정확히 입력하세요");
//					}
//				}
//				
//				
//
//				accountList[count++] = account; // 객체 생성하여 저장
//
//			} else if (num.equals("2")) {
//				System.out.println("------");
//				System.out.println("계좌목록");
//				System.out.println("------");
//
//				if (accountList == null) {
//					System.out.println("생성된 계좌가 없습니다");
//				} else {
//					for (Account account : accountList) {
//						if (account != null)
//							System.out.println(
//									account.getAccount() + "\t" + account.getName() + "\t" + account.getBalance());
//					}
//				}
//
//			} else if (num.equals("3")) {
//				System.out.println("------");
//				System.out.println("예금");
//				System.out.println("------");
//				System.out.print("계좌번호: ");
//
//				for (int i = 0; i < accountList.length; i++) {
//					if (accountList[i] != null) {
//						while (true) {
//							accountNum = scanner.nextLine();
//							String checkAccount = accountList[i].getAccount();
//							if (accountNum.equals(checkAccount)) {
//								System.out.print("예금액: ");
//								balance = Integer.parseInt(scanner.nextLine());
//								newBalance = accountList[i].getBalance() + balance;
//								accountList[i].setBalance(newBalance);
//								System.out.println("금액: " + accountList[i].getBalance());
//								break;
//							} else {
//								System.out.println("정확한 계좌번호를 입력하세요");
//								System.out.print("계좌번호: ");
//
//							}
//						}
//
//					}
//
//				}
//
//			} else if (num.equals("4")) {
//				System.out.println("------");
//				System.out.println("출금");
//				System.out.println("------");
//				System.out.print("계좌번호: ");
//
//				for (int i = 0; i < accountList.length; i++) {
//					if (accountList[i] != null) {
//						while (true) {
//							accountNum = scanner.nextLine();
//							String checkAccount = accountList[i].getAccount();
//							if (accountNum.equals(checkAccount)) {
//								System.out.print("출금액: ");
//								balance = Integer.parseInt(scanner.nextLine());
//								if (accountList[i].getBalance() - balance < 0) {
//									System.out.println("계좌에 남은 돈을 확인하세요.");
//									System.out.println("남은 금액: " + accountList[i].getBalance());
//									System.out.print("계좌 번호: ");
//								} else {
//									newBalance = accountList[i].getBalance() - balance;
//									accountList[i].setBalance(newBalance);
//									System.out.println("금액: " + accountList[i].getBalance());
//									break;
//								}
//
//							} else {
//								System.out.println("정확한 계좌번호를 입력하세요");
//								System.out.print("계좌번호: ");
//							}
//						}
//					}
//
//				}
//
//			} else if (num.equals("5")) {
//				System.out.println("프로그램 종료");
//				break;
//
//			} else {
//				System.out.println("1~5까지 유효한 숫자를 입력해주세요");
//			}
//
//		}
//	}
//
//}
