package codingtest;

import java.util.*;

public class BOJ5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] sArray = s.split("");
		int answer = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(sArray[i].equals("A") || sArray[i].equals("B") ||sArray[i].equals("C")  ) {
				answer +=3;
			}else if(sArray[i].equals("D") ||sArray[i].equals("E")||sArray[i].equals("F")) {
				answer+=4;
			}else if(sArray[i].equals("G") ||sArray[i].equals("H")||sArray[i].equals("I")) {
				answer+=5;
			}else if(sArray[i].equals("J") ||sArray[i].equals("K")||sArray[i].equals("L")) {
				answer+=6;
			}else if(sArray[i].equals("M") ||sArray[i].equals("N")||sArray[i].equals("O")) {
				answer+=7;
			}else if(sArray[i].equals("P") ||sArray[i].equals("Q")||sArray[i].equals("R") ||sArray[i].equals("S")) {
				answer+=8;
			}else if(sArray[i].equals("T") ||sArray[i].equals("U")||sArray[i].equals("V")) {
				answer+=9;
			}else if(sArray[i].equals("W") ||sArray[i].equals("X")||sArray[i].equals("Y") ||sArray[i].equals("Z") ) {
				answer+=10;
			}
		
		}
		System.out.println(answer);
	}

}
