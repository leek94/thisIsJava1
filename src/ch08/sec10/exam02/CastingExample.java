package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		//자동 타입 변환
		Vehicle vehicle = new Bus();

		vehicle.run(); // vehicle 타입에 1개만 선언되어 있어 1개만 사용 가능

		//강제 타입 변환
		Bus bus = (Bus) vehicle; // Bus 타입으로 변경하면 2개의 메서드 사용 가능
		// 애초에 Bus 타입으로 만들어졌던거여서 Bus로 강제 타입 변환 가능
		bus.run();
		bus.checkFare();

	}

}
