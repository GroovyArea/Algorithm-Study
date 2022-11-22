package 백준.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 유기농 배추
 */
public class BJ1012 {

    static int[][] cabbageField;
    static boolean[][] cabbageCheck;
    static int height;
    static int weight;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            weight = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());
            cabbageField = new int[weight][height];
            cabbageCheck = new boolean[weight][height];

            int k = Integer.parseInt(st.nextToken());
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                cabbageField[x][y] = 1; // 배추 위치 넣기
            }
        }

        int earthWormCount = 0; // 지렁이 개수 파악

        // 가로, 세로 좌표를 이용하여 체크 시작
        for (int i = 0; i < weight; i++) {
            for (int j = 0; j < height; j++) {

                // 배추 있는지 체크, 체크를 한 곳인지 동시에
                if (cabbageField[i][j] == 1 && !cabbageCheck[i][j]) {
                    bfs(i, j);

                    earthWormCount++;
                }
            }
        }

        System.out.println(earthWormCount);
    }

    static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{x, y});

        cabbageCheck[x][y] = true; // 첫 좌표는 무조건 배추가 존재

        int[] X = {0, 0, -1, 1};
        int[] Y = {-1, 1, 0, 0};

        while (!queue.isEmpty()) {
            int[] polledArr = queue.poll();

            for (int i = 0; i < 4; i++) {
                int xp = polledArr[0] + X[i];
                int yp = polledArr[1] + Y[i];

                if (xp < 0 || xp >= weight || yp < 0 || yp >= height) {
                    continue;
                }

                if (cabbageField[xp][yp] == 1 && !cabbageCheck[xp][yp]) {
                    queue.offer(new int[]{xp, yp});
                    cabbageCheck[xp][yp] = true;
                }
            }
        }
    }

    static void dfs(int x, int y) {
        cabbageCheck[x][y] = true;

        int[] X = {0, 0, -1, +1};
        int[] Y = {-1, +1, 0, 0};


        for (int i = 0; i < 4; i++) {
            int xp = x + X[i];
            int yp = y + Y[i];

            if (xp < 0 || xp >= weight || yp < 0 || yp >= height) {
                continue;
            }

            if (cabbageField[xp][yp] == 1 && !cabbageCheck[xp][yp]) {
                dfs(xp, yp);
            }
        }
    }
}
