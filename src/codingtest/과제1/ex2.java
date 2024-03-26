package codingtest.과제1;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String[] sArray = s.split(",");
		int min = Integer.MAX_VALUE;
		int answer = 0;

		for (int i = 0; i < sArray.length; i++) {
			if (Integer.parseInt(sArray[i]) % 2 == 1) {
				answer += Integer.parseInt(sArray[i]);
				if (min > Integer.parseInt(sArray[i])) {
					min = Integer.parseInt(sArray[i]);
				}
			}
		}

		if (answer == 0) {
			System.out.println(-1);
		} else {
			System.out.println(answer);
			System.out.println(min);

		}

	}

}
