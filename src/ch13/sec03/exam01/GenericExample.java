package ch13.sec03.exam01;

public class GenericExample {
	// 제네릭 메소드
	public static <C> Box<C> boxing(C c) { // Box가 어떤 값이 들어가는 지 정해지지 않았을 경우 파라메타 사용 가능
		Box<C> box = new Box<>();
		box.set(c);
		return box;

	}

	public static void main(String[] args) {

//		Box<String> box = new Box<>();
//		box.set("ABC");
//		System.out.println(box.get());

		// 제네릭 메소드 호출
		Box<String> box1 = boxing("abc"); // -> String 값을 넣어주면 C가 String으로 변경됨
		System.out.println(box1.get());
		Box<Integer> box2 = boxing(100);
		System.out.println(box2.get());

	}

}
