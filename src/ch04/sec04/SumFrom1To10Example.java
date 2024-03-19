package ch04.sec04;

public class SumFrom1To10Example {
	public static void main(String[] args) {
		int sum = 0; // 여기서 초기화 하는 이유는 for문에서 사용하기 떄문
		int i; // 밑에 for문에서 초기화 하기때문에 초기화 X
		
		for(i = 1; i <=100; i++) {
			sum += i; // sum = sum + i와 같은데 sum이 초기화하지 않으면 연산 불가능해서 위에서 초기화
		}
		System.out.println("1~" + (i-1) +" 합 : " + sum);
	}
	

}
