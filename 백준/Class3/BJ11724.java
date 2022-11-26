package 백준.Class3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 연결 요소의 개수
 */
public class BJ11724 {
    static int n;
    static int m;
    static int answer;
    static boolean[] visited;
    static int[][] nodes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];

        nodes = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            nodes[u][v] = 1;
            nodes[v][u] = 1;
        }

        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }

        System.out.println(answer);

    }

    static void dfs(int i) {
        visited[i] = true;

        for (int j = 0; j <= n; j++) {
            if (nodes[i][j] == 1 && !visited[j]) {
                dfs(j);
            }
        }
    }
}
