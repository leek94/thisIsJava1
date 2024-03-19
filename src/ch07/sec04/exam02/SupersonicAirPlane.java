package ch07.sec04.exam02;

public class SupersonicAirPlane extends Airplane{
	// Enum 타입 선언
	public enum FlyMode2{
		NORMAL,
		SUPERSONIC
		
	}
	
	//상수 선언
//	public static final int NORMAL = 1;
//	public static final int SUPERSONIC = 2;
	
	//상태 필드 선언
	public FlyMode flyMode = FlyMode.NORMAL;
	
	//메소드 재정의
	@Override
	public void fly() {
		if(flyMode == FlyMode.SUPERSONIC) {
			System.out.println("초음속 비행합니다");
		}else {
			super.fly();
		}
	}
}
