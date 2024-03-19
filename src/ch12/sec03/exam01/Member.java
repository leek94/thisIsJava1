package ch12.sec03.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member targer) {
			if(id.equals(targer.id)) {
				return true;
			}
		}
	
		return false;
	}
	

}
