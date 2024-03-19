package ch06.sec8.exam02;

public class Computer {
	//Field 선언
	
	//Constructor 선언
	
	//Method 선언
	int sum1(int[] values) {
		int result = 0;
		for(int value : values) {
			result += value;
		}
		return result;
	}
	
	int sum2(int ... values) {
		int result = 0;
		for(int value : values) {
			result += value;
		}
		return result;
	}
}
