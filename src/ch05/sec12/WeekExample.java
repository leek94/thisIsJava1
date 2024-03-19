package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		Week today = null; // Week는 참조 타입이므로 null로 초기하 가능
		
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR); // 년도
		int month = now.get(Calendar.MONTH) + 1; // 월(1~12)
		int day = now.get(Calendar.DAY_OF_MONTH); //일
		int week = now.get(Calendar.DAY_OF_WEEK); //요일(1~7) 1일요일 2월요일
		int hour = now.get(Calendar.HOUR); //시간
		int minute = now.get(Calendar.MINUTE); //분
		int second = now.get(Calendar.SECOND); //초
		
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDESDAY; break;
		case 5: today = Week.THURDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		
		if(today == Week.SUNDAY) { // 여기서 Week.SUNDAY를 1로 변경해도 되는데
								   // 가독성이 떨어짐
			System.out.println("일요일에는 자바 공부를 합니다.");
		}else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
	}

}