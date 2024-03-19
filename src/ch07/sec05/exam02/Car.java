package ch07.sec05.exam02;

public class Car {
	// Field 선언

	public int speed;

	// Construct 선언

	// Method 선언
	public void speedUp() {
		System.out.println("스피드가 올랐다");
		speed += 1;
	}

	// final 메소드 선언
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
