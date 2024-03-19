package ch13.sec05;

public class GenericExample {

	public static void main(String[] args) {
		//Course1 등록
//		Applicant <Person> app1 = new Applicant<>(new Person());
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println("-------------------------------------");
		
		//Course2 등록
//		Course.registerCourse2(new Applicant<Person>(new Person())); //자손 아님
//		Course.registerCourse2(new Applicant<Worker>(new Worker())); //자손 아님
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println("-------------------------------------");
		
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
//		Course.registerCourse3(new Applicant<Student>(new Student())); // Worker의 부모 아님
//		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent())); // Worker의 부모 아님
//		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent())); // Worker의 부모 아님
	}

}
