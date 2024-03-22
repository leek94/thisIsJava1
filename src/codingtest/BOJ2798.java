package codingtest;

import java.util.*;

public class BOJ2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] card = new int[N];
		int min = 0;

		for (int i = 0; i < N; i++) {
			card[i] = sc.nextInt();
		}

		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = i + 2; k < N; k++) {
					if (min < card[i] + card[j] + card[k] && M >= (card[i] + card[j] + card[k])) {
						min = card[i] + card[j] + card[k];
					}

				}
			}
		}
		System.out.println(min);

	}

}
