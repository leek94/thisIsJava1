package codingtest.과제1;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] array = new int[10];
		
		int num = A*B*C;
		
		String numStr = String.valueOf(num);
		String[] numArray = numStr.split("");
		
		for(int i =0; i<numArray.length; i++) {
			
			array[Integer.parseInt(numArray[i])]++;
		}
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
