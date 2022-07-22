package Programmers;

public class 하노이의탑 {

    private int index = 0;

    public int[][] solution(int n) {
        int[][] answer = new int[(int) Math.pow(2, n) - 1][2];

        doHanoi(n, 1, 3, 2, answer);

        return answer;
    }

    public void doHanoi(int n, int start, int via, int finish, int[][] answer) {
        if (n == 1)
            answer[index++] = new int[]{start, via};
        else {
            doHanoi(n - 1, start, finish, via, answer);// 가장 큰 원판을 제외한 나머지를 2번 기둥으로 이동
            answer[index++] = new int[]{start, via};// 최종 가장 큰 링을 1번에서 3번으로 이동
            doHanoi(n - 1, finish, via, start, answer);// n-1 하노이의 탑을 다시 반복하기 위해 재귀호출
        }
    }
}
