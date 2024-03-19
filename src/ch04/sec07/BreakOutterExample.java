package ch04.sec07;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter; // 라벨을 달아서 바깥 for문을 종료함
					// break; // 안쪽 for문만 종료함
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}