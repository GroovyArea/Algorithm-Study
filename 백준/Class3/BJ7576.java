package 백준.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 토마토
 */
public class BJ7576 {

    static final int RIPPED = 1;
    static final int NON_RIPPED = 0;

    static int m, n;
    static int[][] box;
    static Queue<Tomato> q = new LinkedList<>();
    static int day = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        box = new int[n][m];

        for (int i = 0; i < n; i++) {
            String row = br.readLine();
            st = new StringTokenizer(row);

            for (int j = 0; j < m; j++) {
                String isRipped = st.nextToken();
                box[i][j] = Integer.parseInt(isRipped);

                if (isRipped.equals(String.valueOf(RIPPED))) { // 해당 좌표의 토메이로가 익었을 경우
                    q.offer(new Tomato(i, j, 0)); // 익은 토메이로 추가
                }
            }
        }

        bfs();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == NON_RIPPED) { // 안 익은 토메이로가 있을 때
                    day = -1; //
                }
            }
        }

        if (day != -1) {
            System.out.println(day - 1);
        } else {
            System.out.println(day);
        }
    }

    private static void bfs() {
        int[] xr = {1, -1, 0, 0};
        int[] yr = {0, 0, 1, -1};

        while (!q.isEmpty()) {
            Tomato tomato = q.poll();

            int tx = tomato.px;
            int ty = tomato.py;
            int days = tomato.day + 1;

            for (int i = 0; i < 4; i++) {
                int ptx = tx + xr[i];
                int pty = ty + yr[i];

                if (ptx >= 0 && ptx < n && pty >= 0 && pty < m) {
                    day = days;

                    if (box[ptx][pty] == NON_RIPPED) { // 아직 익지 않은 토메이로가 있을 경우
                        q.offer(new Tomato(ptx, pty, days)); // 다시 넣어!
                        box[ptx][pty] = RIPPED; // 익게 만들어
                    }
                }
            }
        }
    }
}

class Tomato {
    int px;
    int py;
    int day;

    public Tomato(int px, int py, int day) {
        this.px = px;
        this.py = py;
        this.day = day;
    }
}

