package ch15.sec05.exam03;

public class Person implements Comparable<Person> {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		int result = this.name.compareTo(o.name);
		//name이 먼저오면 -1 o.name이 먼저 오면 1 , 같으면 0
		return result;
	}

}
