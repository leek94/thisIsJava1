package ch04.sec03;

public class SwitchExpressionsExample {

	public static void main(String[] args) {
		char grade = 'B';
			// 이 기능은 자바 12 부터 가능
		switch (grade) {  //괄호를 사용해서 ﻿두가지 경우를 한번에 처리 할 수있다.
		case 'A', 'a' -> {
			System.out.println("우수 회원입니다");
		}
		case 'B', 'b' -> {
			System.out.println("일반 회원입니다");
		}
		default -> {
			System.out.println("손님입니다");
		}
		}
		switch(grade) { //만약 실행문이 한줄일 경우 괄호 생략 가능
		case 'A', 'a' -> System.out.println("우수 회원입니다");
		case 'B', 'b' -> System.out.println("일반 회원입니다");
		default -> System.out.println("손님입니다");
		}
	}

}
