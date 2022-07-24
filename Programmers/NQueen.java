package Programmers;

public class NQueen {
    int answer = 0;

    public int solution(int n) {

        if (n == 1 || n == 2 || n == 3) {
            return 0;
        }

        int[] queenX = new int[n];
        int[] queenY = new int[n];

        for (int i = 0; i < n; i++) {
            queenX[0] = 0;
            queenY[0] = i;
            queenPosition(queenX, queenY, 1, n);
        }

        return answer;
    }

    public void queenPosition(int[] queenX, int[] queenY, int count, int n) {
        if (count == n) {
            answer++;
            return;
        }

        for (int i = 0; i < n; i++) {
            int afterX = count;
            int afterY = i;
            int possible = 1;

            for (int j = 0; j < count; j++) {
                int beforeX = queenX[j];
                int beforeY = queenY[j];

                if (beforeY == afterY) {
                    possible = 0;
                    break;
                }

                if (((afterX - beforeX) == (afterY - beforeY)) || ((afterX - beforeX) == -(afterY - beforeY))) {
                    possible = 0;
                    break;
                }
            }

            if (possible == 1) {
                queenX[count] = afterX;
                queenY[count] = afterY;
                queenPosition(queenX, queenY, count + 1, n);
            }
        }
    }
}
