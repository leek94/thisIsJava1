package codingtest;

import java.util.*;

public class BOJ10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		for(char i = 97; i <=122; i++) {
			System.out.print( s.indexOf(i)+" ");
		}
	}

}
