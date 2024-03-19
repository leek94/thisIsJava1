package codingtest;

import java.util.*;

public class BOJ2839_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int fiveKgBag = 0;
		int threeKgBag = 0;
		int remainBag;
		
		for (fiveKgBag = N / 5; fiveKgBag >= 0; fiveKgBag--) {
			remainBag = N - (5*fiveKgBag);
				if(remainBag%3==0) {
					threeKgBag = remainBag/3;
					System.out.println(fiveKgBag + threeKgBag);
					break;
				}
			
		}
		
		if(fiveKgBag + threeKgBag <0) {
			System.out.println("-1");
		}

	}
}
