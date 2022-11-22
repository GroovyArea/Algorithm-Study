package 백준.Class3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ1260 {
    static int[][] branch;
    static boolean[] visit;
    static Queue<Integer> queue;
    static int N;
    static int M;
    static int V;

    static void dfs(int start) {
        visit[start] = true;
        System.out.print(start + " ");
        for (int i = 1; i <= N; i++) {
            if (branch[start][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int start) {
        queue = new LinkedList<>();
        queue.add(start);
        visit[start] = true;
        System.out.print(start + " ");

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 1; i < branch.length; i++) {
                if (branch[temp][i] == 1 && !visit[i]) {
                    queue.add(i);
                    visit[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        V = in.nextInt();

        branch = new int[1001][1001];
        visit = new boolean[1001];

        // 인접행렬 생성
        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            branch[a][b] = branch[b][a] = 1;
        }

        // 정점은 1로 부터 DFS 시작
        dfs(V);
        System.out.println();

        // DFS가 완료되면 visit list 초기화 해줘야됨
        Arrays.fill(visit, false);
        // 정점은 1로 부터 DFS 시작
        bfs(V);
    }
}
