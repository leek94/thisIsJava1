package ch07.sec10.exam02;

public class Cat extends Animal{
	
	
	public Cat(String kind, String color) {
		super(kind, color);
		
	}
	@Override
	public void sound() {
		System.out.println("야옹쑤~");
	}
	public void catchMouse() {
		System.out.println("쥐를 잡자 쥐를 잡자 찍찍찍");
	}
	
}
