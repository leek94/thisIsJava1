package codingtest.과제1;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String answer = "";
		String s = sc.nextLine();
		char[] charArray = s.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			int charNum = (charArray[i] + 4);
			if (charNum > 122) {
				charNum = (charNum % 122) + 96;

			}
			answer += (char)charNum + "";
		}

		System.out.println(answer);
	}
}
