package ch18.sec07.exam02;

import java.io.*;

public class ReadLineExample {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("src/ch18/sec07/exam01/BufferExample.java"));
		
		int lineNo = 1;
		while(true) {
			String line = br.readLine(); // 한 행씩 읽어 들임
			if(line == null) break;
		
			System.out.println(lineNo + "\t" + line);
			lineNo++;
		
		}
	
		br.close();
	
	
	}

}
