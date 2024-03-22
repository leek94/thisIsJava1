package ch15.sec03.exam02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Data
public class Member {
	private String name;
	private int age;
	
}
