package ch05.test;

public class SumAndAverage {

	public static void main(String[] args) {
		
		int [][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int totalStudent = 0;
		int totalSum = 0;
		for(int i =0; i<array.length; i++) {
			totalStudent += array[i].length;
			for(int j = 0; j<array[i].length; j++) {
				totalSum += array[i][j];
			}
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("학생 전체 합: " + totalSum);
		System.out.println("학생 전체 평균: " + totalAvg);
	}

}
