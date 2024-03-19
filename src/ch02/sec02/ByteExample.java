package ch02.sec02;

public class ByteExample {

	public static void main(String[] args) {
		
//		byte x =  200; // byte는 -128부터 127까지의 범위를 가지고 있는데 범위를 넘는 값을 넣으려고 해서 에러가 남 mismatch
		byte v1 = 100;
		short v2 = 100;
		int v3 = 100;
		long v4 = 100; // 4가지 방법 모두 100의 값을 저장할 수 있지만 int는 4바이트가 long은 8바이트가 필요하다
					   // 그러므로 가장 적게 필요한 byte를 사용하는게 저장에 유리하다
					   // 하지만 연산을 할때는 CPU의 영향을 많이 받음
					   // CPU는 1 바이트를 연산 할때 4바이트(int)로 변경해서 연산을 하기 때문에 int가 정수의 기본임
					   // 오히려 1바이트 + 1바이트는 4바이트 + 4바이트 보다 연산 속도 느림
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
//		byte var6 = 128; // 컴파일 에러 (Type mismatch: cannot convert from int to byte)
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		byte vv1 = 30;
		byte vv2 = 50;
		int result = vv1 + vv2;
		
		byte vv3 = 80;
		
	}

}
