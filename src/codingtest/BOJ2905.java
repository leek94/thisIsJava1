package codingtest;

import java.util.*;

public class BOJ2905 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		String ANum = sb.append(A).reverse().toString();
		String BNum = sb1.append(B).reverse().toString();
		int AA = Integer.parseInt(ANum);
		int BB = Integer.parseInt(BNum);
		
		if(AA > BB) {
			System.out.println(AA);
		}else {
			System.out.println(BB);
		}
	}

}
