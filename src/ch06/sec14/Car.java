package ch06.sec14;

public class Car {

	//Field 선언
	
	private int speed;   //필드 값은 무조건 private로 작성해서 접근 제한
	private boolean stop;
	
	Car(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() { // Getter
		return speed;
	}
	
	public void setSpeed(int speed) { // Setter
		if(speed < 0) {
			this.speed = 0;
			return; // speed 값에 0을 넣고 종료
		}else {
			this.speed = speed;
		}
	}

	public boolean isStop() { // boolean 값일 경우 Getter는 is로 시작
		return stop;
	}

	public void setStop(boolean stop) {
		if(stop) {
			this.speed = 0;
		}
		this.stop = stop;
	}
}
