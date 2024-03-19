package ch12.sec09;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		double num = 1234567.89;
		double num1 = -1234567.89;
		
		DecimalFormat df;
		
		df = new DecimalFormat("#,###");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.00");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("00000000000000000.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#,###;-#,###");
		System.out.println(df.format(num));
		System.out.println(df.format(num1));
		
		df = new DecimalFormat("\u00A4 #.###");
		System.out.println(df.format(num));
		
	}

}
