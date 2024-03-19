package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		
		int var1 = 10;
		byte var2 = (byte) var1; // 1 byte에 표현할 수 '있는' 값인 int(4byte) 값으로 강제 형변환은 가능
								 // 1 byte에 표현할 수 '없는' 값은 int(4byte) 값으로 형변환시 쓰레기값 저장
		System.out.println(var2);
		
		long var3 = 300;
		int var4 = (int) var3;
		System.out.println(var4);
		
		int var5 = 65;
		char var6 = (char) var5;
		System.out.println(var6);
		
		double var7 = 3.14;
		int var8 = (int) var7;
		System.out.println(var8);
		
	}

}
