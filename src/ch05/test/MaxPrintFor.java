package ch05.test;

public class MaxPrintFor {

	public static void main(String[] args) {
		
		int[] array = {1, 5, 3, 8, 2};
		
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
				index = i;
				}
		}
		
		System.out.println("max : " + max);
		System.out.println("index : " + index);
	}

}
