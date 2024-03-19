package codingtest;

import java.util.*;

public class xyExit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int w = scanner.nextInt();
		int h = scanner.nextInt();

		int min = 1000;

		if (min > x) {
			min = x;
		}
		if (min > y) {
			min = y;
		}
		if (min > w-x) {
			min = w-x;
		}
		if (min > h-y) {
			min = h-y;
		}
		System.out.println(min);

	}
}
