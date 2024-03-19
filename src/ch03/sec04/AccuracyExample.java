package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
		// 결과 값 = 사과 1개에서 남은 양: 0.29999999999999993
		// 기댓 값 = 0.3
		// 컴퓨터 계산에서 0.1을 정확하게 계산하지 못함 0.09999999999...
	}
}
