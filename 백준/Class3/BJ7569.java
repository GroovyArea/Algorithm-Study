package 백준.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 토마토 3차원 버전
 */
public class BJ7569 {

    static int m, n, h;
    static Queue<Tomato2> q = new LinkedList<>();
    static int day;
    static int[][][] box;
    static int[] dx = {0, 0, -1, 1, 0, 0};
    static int[] dy = {0, 0, 0, 0, 1, -1};
    static int[] dz = {1, -1, 0, 0, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        box = new int[h][n][m];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());

                for (int k = 0; k < m; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());

                    if (box[i][j][k] == 1) {
                        q.offer(new Tomato2(k, j, i, 0)); // 익은 토마톨 넣자.
                    }
                }
            }
        }

        if (q.size() == m * n * h) { // 다 익은 경우는 0 출력
            System.out.println(0);
            return;
        }

        bfs();

        System.out.println(day);
    }

    static void bfs() {

        while (!q.isEmpty()) {
            Tomato2 tomato = q.poll();

            int x = tomato.px;
            int y = tomato.py;
            int z = tomato.pz;

            for (int i = 0; i < 6; i++) {
                int px = x + dx[i];
                int py = x + dy[i];
                int pz = x + dz[i];

                if (px < 0 || py < 0 || pz < 0 || px >= m || py > n || pz > h) {
                    continue;
                }

                if (box[px][py][pz] == 0) { // 안 익은게 있을 경우
                    box[px][py][pz] = box[x][y][z] + 1; // 일단 익은 날짜를 저장하고
                    q.offer(new Tomato2(px, py, pz, 0)); // 큐에 익은 토마토 넣기
                }
            }
        }

        int maxDay = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (box[i][j][k] == 0) {  // 가능하지 않을 테지만 한번 더 검증
                        System.out.println(-1);
                        return;
                    }

                    if (maxDay < box[i][j][k]) {
                        maxDay = box[i][j][k]; // 가장 큰 숫자일때 최소 익는 일자가 가능
                    }
                }
            }
        }

        day = maxDay - 1;
    }
}

class Tomato2 {
    int px;
    int py;
    int pz;
    int day;

    public Tomato2(int px, int py, int pz, int day) {
        this.px = px;
        this.py = py;
        this.pz = pz;
        this.day = day;
    }
}
