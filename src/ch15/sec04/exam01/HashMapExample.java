package ch15.sec04.exam01;

import java.util.*;
import java.util.Map.*;

public class HashMapExample {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();

		map.put("신우호", 85); // int 값인 85 자동박싱 Integer로 번지값 저장되는것
		map.put(new String("신우호"), 90); // 같은 값 저장시 대체되서 90이 나옴
		// 동등 객체로 봐서 저장안됨
		// hashCode(), equals 재정의 되어서
		map.put("심영조", 80);
		map.put("변혜미", 90);

		// 저장된 엔트리 수 (=키의 수)

		System.out.println("총 Entry의 수 :" + map.size());
		System.out.println(map.get("신우호")); // 90 나옴 대체 되서
		System.out.println();

		// 키로 값 얻기
		String key = "신우호";
		int value = map.get(key);
		System.out.println(key + " : " + value);

		System.out.println();

		// Entry를 하나씩 가져와서 키와 값을 출력
		// map.entrySet() map의 Entry를 set으로 리턴
		for (Entry<String, Integer> entry : map.entrySet()) {
			String k = entry.getKey();
			int v = entry.getValue();
			System.out.println(k + " : " + v);

		}
		System.out.println();

		for (String k : map.keySet()) {
			int v = map.get(k);
			System.out.println(k + " : " + v);
		}
		System.out.println();

		//반복자 사용하려면 set이나 List 타입이여야함 Map은 사용 못함
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();

			String k = entry.getKey();
			int v = entry.getValue();

			if (k.equals("심영조")) {
				iterator.remove();
			} else {
				System.out.println(k + " : " + v);
			}

		}
	
	}

}
