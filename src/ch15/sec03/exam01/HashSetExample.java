package ch15.sec03.exam01;


import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<String> set = new HashSet<>();
		
		//객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java"); // <- 중복 객체이므로 저장하지 않음
		set.add("Spring");
		set.add(new String("Java")); // 저장 X
		//String은 hash코드와 equals가 재정의 되어서 동등 객체로 본다 -> 저장 안함
		
		// 저장된 객체 수 출력
		System.out.println("총 객체 수 : " + set.size());
		
	}

}
