package codingtest;

import java.io.*;
import java.util.*;

public class BOJ11718 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {

			if (line.isEmpty()) {
				break;
			}

			StringTokenizer st = new StringTokenizer(line);

			while (st.hasMoreTokens()) {
				System.out.println(st.nextToken());
			}
		}
		br.close();
	}

}
