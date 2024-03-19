package ch07.sec10.exam01;

import ch07.sec10.*;

public class IPhone extends MobilePhone {


	public IPhone(String owner) {
		super(owner);
	}
	
	@Override
	public void internetSeach() {
		System.out.println("사파리 브라우저로 인터넷을 검색합니다.");
	}
}
