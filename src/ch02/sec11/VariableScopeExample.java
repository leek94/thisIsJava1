package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0;
		if(v1>10) { // 실행이 되지만 실행이 안될 경우도 있기 때문에 v2를 초기화 해야함
			v2 = v1 - 10;
		}
	
		int v3 = v1 + v2 + 5; // v2가 if문에서 선언된 변수여서 사용 불가능
		System.out.println(v3);
	}
		
}
