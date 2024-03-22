package ch18.sec07.exam01;

import java.io.*;

public class BufferExample {

	public static void main(String[] args) throws Exception {
		// 입출력 스트림 생성
		String originalFilePath1 = "D:\\KosaCourse\\projects\\JavaProgramming\\JavaProgramming\\src\\ch18\\sec07\\exam01\\image.png";
		// 절대 경로
		
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		// / 슬래시 1개나 \\ 역슬래시 2개나 같은 구분자로 봄 \\ 은 이스케이프 문으로 2개 적어야 \ 하나로 읽음

		String originalFilePath2 = BufferExample.class.getResource("image2.png").getPath(); // 상대 경로
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";

		// 버퍼를 사용하지 않는 입출력 스트림
		InputStream is1 = new FileInputStream(originalFilePath1);
		OutputStream os1 = new FileOutputStream(targetFilePath1);

		// 버퍼를 사용하는 입출력 스트림
		InputStream is2 = new FileInputStream(originalFilePath2);
		OutputStream os2 = new FileOutputStream(targetFilePath2);

		BufferedInputStream bis = new BufferedInputStream(is2);
		BufferedOutputStream bos = new BufferedOutputStream(os2);

		// 복사 시간 비교하기
		long nonBufferTime = copy(is1, os1);
		System.out.println("버퍼 미사용:\t" + nonBufferTime + " ns");

		long bufferTime = copy(bis, bos);
		System.out.println("버퍼  사용:\t" + bufferTime + " ns"); // 버퍼 사용과 미사용시 사용이 100배 빠름 ns로
		
		is1.close();
		os1.close();
		bis.close();
		bos.close(); // 보조스트림이 달린 주 스트림은 보조 스트림만 close하면 주 스트림도 자동적으로 종료됨

	}

	public static long copy(InputStream is, OutputStream os) throws Exception {

		long start = System.nanoTime();
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime(); 
		return (end - start);
	}

}
