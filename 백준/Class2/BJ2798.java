package 백준.Class2;

import java.util.Scanner;

public class BJ2798 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        int answer = getNearSum(cards, n, m);

        System.out.println(answer);
    }

    static int getNearSum(int[] cards, int n, int m) {
        int sum = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // 3개 각기 다른 카드, 범위를 1칸씩 옮겨간 3중 포문 돌리기
                    int answer = cards[i] + cards[j] + cards[k];

                    // M번 카드와 합이 같은 경우
                    if (m == answer) {
                        return answer;
                    }

                    if (sum < answer && answer < m) {
                        sum = answer;
                    }
                }
            }
        }

        return sum;
    }

}
