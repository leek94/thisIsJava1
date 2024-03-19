package codingtest;

import java.util.*;

public class BOJ2563 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[][] backGround = new int[100][100];

		int N = scanner.nextInt();
		int x = 0;
		int y = 0;
		int count =0;

		for (int k = 0; k < N; k++) {
			x = scanner.nextInt();
			y = scanner.nextInt();

			for (int i = x; i < x + 10; i++) {
				for (int j = y; j < y + 10; j++) {
					if(i<100 && j<100) {
						backGround[i][j] = 1;
					}
					
				}
			}

		}
		
		for(int i =0; i<100; i++) {
			for(int j = 0; j <100; j++) {
				if(backGround[i][j] == 1) {
					count += 1;
				}
			}
		}
		System.out.println(count);

	}
}
