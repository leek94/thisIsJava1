package ch07.sec09;

public class InstanceofExample {

	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
//		if(person instanceof Student) {
//			Student student = (Student) person;
//			System.out.println("studentNo" + student.studentNo);
//			student.study();
//		}
		if(person instanceof Student student) {
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
		
	}
	
	public static void main(String[] args) {
		Student st = new Student("감감", 200);
		personInfo(new Person("홍길동"));
		personInfo(new Student("감자바",100));
		System.out.println(st.name); // super로 부모 필드에 값 저장하면 
									 // 자식 필드에도 값 저장됨
	}

}
