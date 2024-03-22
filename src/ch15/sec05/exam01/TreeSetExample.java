package ch15.sec05.exam01;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		//Set으로 받을 경우 treeset 메서드 사용 불가
		//TreeSet 컬렉션 생성
		TreeSet<Integer> scores = new TreeSet<>();
		
		//Integer 객체 저장 -> 자동 박싱
		scores.add(87);
		scores.add(98);
		scores.add(88);
		scores.add(75);
		scores.add(95);
		scores.add(80); // 값을 막 넣어도 자동 정렬
		
		
		
		//특정 Integer 객체를 가져오기
		System.out.println("가장 낮은 점수: " + scores.first());
		System.out.println("가장 높은 점수: " + scores.last());
		System.out.println("95점 아래 점수: " + scores.lower(95));
		System.out.println("95점 위 점수: " + scores.higher(95));
		System.out.println("95점이거나 바로 아래의 점수: " + scores.floor(95));
		System.out.println("85점이거나 바로 위의 점수: " + scores.ceiling(85));
		System.out.println();
		
		//정렬된 Integer 객체를 하나씩 가져오기
				for(Integer s : scores) {
					System.out.print(s + " ");
				}
				System.out.println("\n");
				
		//하나씩 객체를 내림 차순으로 가져오기
		for(int score : scores.descendingSet()) {
			System.out.print(score + " ");
		}
		System.out.println("\n");

		// 범위 검색(80<=)
		for(int score : scores.tailSet(80, true)) {
			System.out.print(score + " ");
		}
		System.out.println("\n");
			
		// 범위 검색(80<=, <90)
			for(int score : scores.subSet(80, true, 90,false)) {
				System.out.print(score + " ");
			}
			System.out.println("\n");
		

	}

}
