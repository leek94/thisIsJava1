package ch06.sec4;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student(); // new가 객체의 번지를 리턴하여 s1변수에 번지 값을 저장함

		Student s2 = new Student();
		Student s3 = s1;

		if (s1 == s3) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
	}

}
