package ch15.sec04.exam01;

import java.util.*;
import java.util.Map.*;

public class HashMapExample2 {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<Member, Integer> map = new HashMap<>();

		map.put(new Member("신우호", 25), 85); // int 값인 85 자동박싱 Integer로 번지값 저장되는것
		map.put(new Member("신우호", 25), 90); // 같은 값 저장시 대체되서 90이 나옴
		// 동등 객체로 봐서 저장안됨
		// hashCode(), equals 재정의 되어서
		map.put(new Member("변혜미", 29), 90);
		map.put(new Member("심영조", 25), 90);

	}
}
