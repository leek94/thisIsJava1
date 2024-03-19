package ch07.sec07.exam02;

public class ChildeExample {

	public static void main(String[] args) {
		// 자식 객체 생성
		Child child = new Child();

		child.method1();
		child.method2(); // -> 재정의
		child.method3();

		// 자동 타입 변환
		Parent parent = child;

		// 메소드 호출
		parent.method1();
		parent.method2(); // 재정의
//		parent.method3(); -> 호출 불가능 parent에 구현되지 않은 메서드이기 때문에

		
		if(child == parent) {
			System.out.println("같은 객체를 참조");
		}else {
			System.out.println("다른 객체를 참조");
		}
	}

}
