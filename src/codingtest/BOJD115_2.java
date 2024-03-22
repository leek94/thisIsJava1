package codingtest;

import java.util.*;

public class BOJD115_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		StringTokenizer st = new StringTokenizer(S);
		int count = 0;

		while (st.hasMoreTokens()) {
			st.nextToken();
			count++;
		}

		System.out.println(count);

	}

}
