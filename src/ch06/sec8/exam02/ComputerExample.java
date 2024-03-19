package ch06.sec8.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30};
		// 배열로 직접 생성
		Computer com = new Computer();
		int result1 = com.sum1(arr1);
		System.out.println("result1 : " + result1);
		
		int result2 = com.sum1(new int[] {10, 20, 30});
		System.out.println("result2 : " + result2);
		
//		int result3 = com.sum1(10, 20, 30);
//		System.out.println("result3 : " + result3);
		
		int[] arr2 = {10, 20, 30};
		
		System.out.println("-------------------------------");
		// 가변길이 매개변수로 생성
		int result4 = com.sum2(arr1);
		System.out.println("result1 : " + result4);
		
		int result5 = com.sum2(new int[] {10, 20, 30});
		System.out.println("result2 : " + result5);
		
		int result6 = com.sum2(10, 20, 30);
		System.out.println("result3 : " + result6);
	}

}
