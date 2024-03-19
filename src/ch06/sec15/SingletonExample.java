package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
//		Singleton st = new Singleton(); --> new 연산자 사용할 수 없음
		
		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance(); // new가 아니고 싱글톤으로 작성하여 같은 객체를 불러옴
		
		st1.method();
		st2.method();
		if(st1 == st2) {
			System.out.println("같은 객체입니다");
		}else {
			System.out.println("다른 객체입니다");
		}
	}

}
