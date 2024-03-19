package ch12.sec03.exam02;

public class Student {
	private int no;
	private String name;

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode(); 
		return hashCode;
		// String에는 같은 문자열이이 같은 해시코드가 나오도록 재정의 되어 있음
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student target) {
			if (no == target.no && name.equals(target.name)) {
				return true;
			}
		}
		return false;
	}
}
