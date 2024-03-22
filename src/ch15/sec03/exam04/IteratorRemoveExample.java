package ch15.sec03.exam04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

//		for (String item : list) {
//			if (item.equals("C")) {
//				list.remove(item);
//			}
//		}
		
//		for(int i =0; i<list.size(); i++) {
//			if(list.get(i).equals("C") || list.get(i).equals("D")) {
//				list.remove(list.get(i));
//			}
//		} // 인덱스 2번인 C가 삭제되면서 하나씩 앞으로 당겨져서 
//		//D가 2번이 되고 i는 3번이라 D가 살아 남음
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			if(item.equals("C")) {
				iterator.remove(); // List에서 값을 지움
			}
		} // 그래서 remove가 있을 경우에는 iterator를 사용해서 반복해야함.
		
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("총 객체의 수: " + list.size());
	}

}
