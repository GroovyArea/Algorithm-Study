package 백준.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 바이러스
 */
public class BJ2606 {

    static boolean[] existChecks;
    static int[][] nodes;
    static int count = 0;

    static int computerCount;
    static int computerPair;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        computerCount = Integer.parseInt(br.readLine());
        computerPair = Integer.parseInt(br.readLine());

        nodes = new int[computerCount + 1][computerCount + 1];
        existChecks = new boolean[computerCount + 1];

        for (int i = 0; i < computerPair; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            nodes[first][second] = nodes[second][first] = 1;
        }
        dfs(1);

        System.out.println(count - 1);

    }

    static void dfs(int start) {
        existChecks[start] = true;
        count++;

        for (int i = 0; i < computerCount; i++) {
            if (nodes[start][i] == 1 && !existChecks[i]) {
                dfs(i);
            }
        }
    }
}
