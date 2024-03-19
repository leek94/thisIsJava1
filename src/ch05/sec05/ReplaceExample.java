package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
		// replace 메서드를 사용해서 변경한 값을 리턴했을 뿐 oldStr의 값이 변경되는것이 아님
		// 만약에 newStr로 값을 리턴하지 않으면 JAVA로 변경된 값은 사용할 수 없음 -> 쓰레기 값
	}
}