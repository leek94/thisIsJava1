package ch13.sec02.exam03;

public class GenericExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.content = "자바";
		
		Box<String> box2 = new Box<>();
		box2.content = "자바";

//		Box<Integer> box3 = new Box();
		boolean result = box1.compare(box2);
		System.out.println("result1: " + result);
		
//		Box box1 = new Box();
//		box1.content = "자바"; //-> 값이 String 값이 들어 갔으므로 안에 equals가 String의 equals가 사용됨
//		
//		Box box2 = new Box();
//		box1.content = "자바";
//
//		Box box3 = new Box();
//		box3.content = 100; // 자동 박싱
//		
//		boolean result1 = box1.compare(box2);
//		System.out.println("result1: " + result1);
	}

}
