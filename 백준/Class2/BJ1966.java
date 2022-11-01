package 백준.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 프린터 큐
 */
public class BJ1966 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());

        for (int j = 0; j < testCase; j++) {
            Queue<int[]> queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int count = 0;

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                int orderNumber = Integer.parseInt(st.nextToken());
                queue.add(new int[]{i, orderNumber});
            }

            while (true) {
                int[] removedNumbers = queue.remove();
                boolean flag = true;

                for (int[] q : queue) {
                    if (q[1] > removedNumbers[1]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    count++;
                    if (removedNumbers[0] == M) {
                        break;
                    }
                } else {
                    queue.add(removedNumbers);
                }
            }
            System.out.println(count);
        }
    }
}

