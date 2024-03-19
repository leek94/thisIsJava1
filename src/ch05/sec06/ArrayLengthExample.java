package ch05.sec06;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {84, 90, 94, 74, 88};
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		
		//배열 항목의 평균 구하기
		double avg = (double) sum / scores.length;
		
		System.out.println("평균: " + avg);
	}

}
