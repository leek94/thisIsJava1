package codingtest;

import java.util.*;

public class BOJD1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();

		String[] SArray = S.trim().split(" ");
		int count = SArray.length;

		if (SArray.length == 1 && S.equals(" ")) {
			//SArray[0].equals(" ") 이걸로 하면 안되는 이유
			count--;

		}

		System.out.println(count);

	}

}
