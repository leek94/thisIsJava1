package ch13.sec05;

public class Applicant<T> {
	public T kind; // 어떤 타입이 올지 몰라서 T 타입 파라메타 사용

	public Applicant(T kind) { // 생성자 초기화로 타입 나중에 변경 예정
		this.kind = kind;
	}
}
