package 백준.Class2;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ11866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder("<");

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            if (count == k - 1) {
                sb.append(queue.poll()).append(", ");
                count = 0;
            } else {
                queue.add(queue.poll());
                count++;
            }
        }

        sb.append(queue.poll()).append(">");

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
