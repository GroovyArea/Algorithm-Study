package 백준.Class2;

import java.util.Scanner;

// 체스판 다시 칠하기
public class BJ1018 {

    static char[][] chess;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        chess = new char[N][M];
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < M; j++) {
                chess[i][j] = s.charAt(j);
            }
        }

        int answer = 23423422; // 그냥 무지막지한 큰 수

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                answer = Math.min(answer, getPaintCount(i, j));
            }
        }

        System.out.println(answer);
    }

    public static int getPaintCount(int a, int b) {
        int black = 0;
        int white = 0;

        for (int i = a; i < a + 8; i++) {
            for (int j = b; j < b + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (chess[i][j] == 'B') {
                        white++;
                    } else {
                        black++;
                    }
                } else {
                    if (chess[i][j] == 'W') {
                        white++;
                    } else {
                        black++;
                    }
                }
            }
        }
        return Math.min(black, white);
    }
}
