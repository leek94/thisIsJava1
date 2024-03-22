package ch15.sec03.exam02;


import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<Member> set = new HashSet<>();
		
		Member m1 = new Member("홍길동", 30);
		Member m2 = new Member("홍길동", 30);
		//객체 저장
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println(m1.hashCode() == m2.hashCode()); // 저장된 번지 값 다름
		System.out.println(m1.equals(m2)); // object의 equals는 == 과 같음 참조 비교(번지 비교)
		// 저장된 객체 수 출력
		
		System.out.println("총 객체 수 : " + set.size());
		
	}

}
