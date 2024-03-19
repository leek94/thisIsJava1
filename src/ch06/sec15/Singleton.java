package ch06.sec15;

public class Singleton {

	//Field 선언
	private static Singleton singleton = new Singleton();
	
	//Construct 선언
	private Singleton() {
		
	}
	
	//Method 선언
	public static Singleton getInstance() {
		return singleton;
	}
	
	public void method() {
		System.out.println("인스턴스 메소드입니다.");
	} // 싱글톤에서 인스턴스 메소드를 사용하고 싶은데 정적으로만 사용하면 이 메서드를 사용할 수 없음
	
}
