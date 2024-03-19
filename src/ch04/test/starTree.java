package ch04.test;

public class starTree {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 + i; j++) {
				if (4 - i > j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i<=4; i++) {
			for(int j =0; j < 9-i; j++) {
				if(j>=i)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}  