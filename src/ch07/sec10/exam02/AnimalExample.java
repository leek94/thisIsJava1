package ch07.sec10.exam02;

public class AnimalExample {

	public static void main(String[] args) {

//		Animal animal = new Cat("한국고양이", "노랑");
//		animal.breathe(); 
//		animal.sound();
//		
//		if(animal instanceof Cat cat) {
//			cat.catchMouse();
//		}
//		
//		System.out.println("============================");
//		Animal animal2 = new Dog("진돗개", "흰색");
//		animal2.breathe();
//		animal2.sound();
//		if(animal2 instanceof Dog dog) {
//			dog.keepHouse();
//		}
		
		dailyLife(new Cat("한국 고양이", "노랑"));
		System.out.println();
		dailyLife(new Dog("진돗개", "흰색"));

	}
	public static void dailyLife(Animal animal) {
		animal.breathe();
		animal.sound();
		
		if(animal instanceof Cat cat) {
			cat.catchMouse();
		}
		
		if(animal instanceof Dog dog) {
			dog.keepHouse();
		}		
		
	}

}
