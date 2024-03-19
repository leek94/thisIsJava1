package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		
//		MobilePhone mp = new MobilePhone("홍길동"); // abstract로 지정도 추상 클래스는 객체 생성 불가
		
		MobilePhone mp;
		
		mp = new AndroidPhone("이경환");
		mp.turnOn(); // 모바일 폰의 메서드
		mp.internetSeach(); // 항상 재정의 된 메서드가 실행됨 -> 안드로이드의 인터넷 서치
		mp.turnOff(); // 모바일 폰의 메서드
		
		
		AndroidPhone ap = new AndroidPhone("홍길동");
		ap.turnOn();
		ap.internetSeach(); // 항상 재정의 된 메서드가 실행됨
		ap.turnOff();

		
		mp = new IPhone("신우호");
		mp.turnOn(); // 모바일 폰의 메서드
		mp.internetSeach(); // 항상 재정의 된 메서드가 실행됨 -> 아이폰의 인터넷 서치
		mp.turnOff(); // 모바일 폰의 메서드
		
		
		IPhone ip = new IPhone("홍길이");
		ip.turnOn();
		ip.internetSeach(); // 항상 재정의 된 메서드가 실행
		ip.turnOff();
		
	}

}
