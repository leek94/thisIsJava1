package ch07.sec05.exam02;

public class SportCarExample {

	public static void main(String[] args) {

		SportCar sc = new SportCar();

		sc.speedUp();
		sc.stop();
		System.out.println("스피드: " + sc.speed);
	}

}
