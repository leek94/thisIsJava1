package ch07.sec09;

public class Student extends Person {
	public int studentNo;
	
	public Student(String name, int studentNo) {
		super(name); // 부모 생성자 호출하여 Person에 name값 저장
		this.studentNo = studentNo; // student에 값 저장
	}
	
	public void study() {
		System.out.println("공부를 합니다");
	}

}
