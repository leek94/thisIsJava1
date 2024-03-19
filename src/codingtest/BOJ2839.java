package codingtest;

import java.util.*;

public class BOJ2839 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		int Min = 5000;

		if (N % 3 == 0) {
			Min = N / 3;
		}

		if (N % 5 == 0) {
			Min = N / 5;
		}
		
		for (int i = 1; i <= N / 5; i++) {
			if (N / 5 >= i) {
				if ((N - i * 5) % 3 == 0) {
					if (Min > i + (N - i * 5) / 3) {
						Min = i + (N - i * 5) / 3;
					}
				}
			}

		}
		
		if(Min==5000) {
			System.out.println("-1");
		}else {
			System.out.println(Min);
		}
		

	}
}
