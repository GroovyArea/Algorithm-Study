package 백준.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 숨바꼭질
 */
public class BJ1697 {

    static int n;
    static int k;
    static boolean[] visited = new boolean[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if (n == k) {
            System.out.println(0);
            return;
        }

        visited[n] = true;

        solve();
    }

    static void solve() {
        Queue<Integer> q = new LinkedList<>();
        q.add(n);

        int size;
        int count = 0;

        while (true) {
            count++;
            size = q.size();

            for (int i = 0; i < size; i++) {
                int polled = q.remove();
                visited[polled] = true;

                if (polled - 1 == k || polled + 1 == k || polled * 2 == k) {
                    System.out.println(count);
                    return;
                }

                if (polled - 1 >= 0 && !visited[polled - 1]) {
                    visited[polled - 1] = true;
                    q.add(polled - 1);
                }
                if (polled + 1 <= 100000 && !visited[polled + 1]) {
                    visited[polled + 1] = true;
                    q.add(polled + 1);
                }
                if (polled * 2 <= 100000 && !visited[polled * 2]) {
                    visited[polled * 2] = true;
                    q.add(polled * 2);
                }
            }
        }
    }
}
