package ch06.sec8.exam03;

public class Car {
	// Field 선언
	int gas;

	// Constructor 선언

	// Method 선언
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량: " + gas-- + ")");
			} else {
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
				break; // return;
			}
		}
		System.out.println("run() 메소드 실행 종료"); // return으로 작성시 여기는 작동 안함 -> 컴파일 에러
	}

}
