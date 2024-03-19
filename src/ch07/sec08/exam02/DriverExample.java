package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver(); // drive 메서드를 위해서 객체 생성
		
		Vehicle vehicle = new Bus();
		Bus bus = new Bus();
		driver.drive(vehicle);
		driver.drive(bus);// Vehicle의 자손만 들어올 수 있음 Bus, Taxi
		
		driver.drive(new Bus());
		
		Vehicle vehicle1 = new Taxi();
		Taxi taxi = new Taxi();
		driver.drive(vehicle1);
		driver.drive(taxi);
		
		driver.drive(new Taxi());
	}

}





