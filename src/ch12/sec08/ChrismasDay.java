package ch12.sec08;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChrismasDay {
	public static void main(String[] args) {
			LocalDateTime now = LocalDateTime.now();
			LocalDateTime chrismas = LocalDateTime.of(now.getYear(), 12, 25,0,0,0);
			long dday = now.until(chrismas, ChronoUnit.DAYS);
			System.out.println(dday);
	} 
}
