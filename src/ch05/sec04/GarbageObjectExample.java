package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null; // "여행"에 해당하는 String 객체를 쓰레기로 만듬
		// null 처리를 해줄 필요가 없다 옛날에 메모리 부족시에나 사용했음
		
		String kind1 = "자동차"; // 객체 생성
		String kind2 = kind1; // 객체(번지) 저장
		kind1 = null; // 두개의 값이 참조 중인데 하나만 null 처리
		System.out.println("kind2:" + kind2);
		// kind2가 참조 하고 있으므로 쓰레기 객체가 아님
	}
}