package ch07.sec10.exam02;

public class Dog extends Animal{

	
	public Dog(String kind, String color) {
		super(kind, color);
	}

	@Override
	public void sound() {
		System.out.println("므엉무엉~");
	}
	
	public void keepHouse() {
		System.out.println("집을 지킵니다.");
	}
	
	
}
 