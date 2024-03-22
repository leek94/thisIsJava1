package ch15.sec03.exam03;


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
//		set.add(new String("Java"));
		//String은 hash코드와 equals가 재정의 되어서 동등 객체로 본다 -> 저장 안함
		
		// 저장된 객체 수 출력
		System.out.println("총 객체 수 : " + set.size());
		
		//하나씩 객체 가져오기
		for(String item : set) {
			System.out.println(item);
		}
		System.out.println();
		
		// 하나씩 객체 가져오기 (2)
		Iterator<String> iterator = set.iterator(); // 반복자 얻음
		while(iterator.hasNext()) {
			String item = iterator.next(); // set에서 객체가 빠져나오는게 아님
			// 그냥 iterator가 내부적으로 카운팅을 함
			
			if(item.equals("JSP")) {
				iterator.remove(); // 이거는 set에서 제거하는 것
			}
			System.out.println(item);
			
		}
		System.out.println();
		
		for(String sss : set) {
			System.out.println(sss);
		}
		
	}

}
