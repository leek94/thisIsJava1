package ch07.sec10.exam01;

import ch07.sec10.*;

public class AndroidPhone extends MobilePhone{


	public AndroidPhone(String owner) {
		super(owner);
	}
	
	@Override
	public void internetSeach() {
		System.out.println("크롬 브라우저로 인터넷을 검색합니다.");
	}

}
