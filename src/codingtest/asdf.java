package codingtest;

import java.util.*;

public class asdf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] backGround = new int[100][100];

        int N = scanner.nextInt();
        int count = 0;

        for (int k = 0; k < N; k++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // 사각형을 그리는 부분을 수정
            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    // 배열 인덱스가 범위 내에 있는지 확인
                    if (i < 100 && j < 100) {
                        // 해당 좌표에 사각형이 그려짐을 표시
                        backGround[i][j] = 1;
                    }
                }
            }

        }

        // 1로 표시된 부분의 개수를 세기
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (backGround[i][j] == 1) {
                    count += 1;
                }
            }
        }
        System.out.println(count);

    }
}
